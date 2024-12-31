package com.quiz.tubespbo.controller;

import com.quiz.tubespbo.model.*;
import com.quiz.tubespbo.service.QuizResultService;
import com.quiz.tubespbo.service.QuizService;
import com.quiz.tubespbo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Collections;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuizResultService quizResultService;

    @Autowired
    private UserService userService;

    // Fungsi untuk menampilkan halaman Manage_Quizzes
    @GetMapping("/manage")
    public String manageQuizzes(Model model) {
        List<Quiz> quizzes = quizService.getAvailableQuizzes();
        model.addAttribute("quizzes", quizzes);
        return "admin/manage_quizzes";
    }

    // Fungsi untuk mengarahkan ke Create_Quiz
    @GetMapping("/new")
    public String createQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz()); // Objek quiz baru untuk binding
        return "admin/create_quiz"; // Path ke template create_quiz.html
    }

    // Fungsi untuk menyimpan quiz (store)
    @PostMapping("/save")
    public String saveQuiz(@ModelAttribute Quiz quiz) {
        // Check if startTime and endTime are valid
        if (quiz.getStartTime() != null && quiz.getEndTime() != null && quiz.getEndTime().isBefore(quiz.getStartTime())) {
            throw new IllegalArgumentException("End time cannot be before start time.");
        }

        quizService.saveQuiz(quiz);
        return "redirect:/quiz/manage";
    }


    // Fungsi untuk menambahkan soal ke quiz
    @GetMapping("/{quizId}/add-question")
    public String addQuestionForm(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("question", new Question()); // Objek baru untuk binding
        }
        return "admin/add_question"; // Path ke template add_question.html
    }

    // Fungsi untuk menyimpan question (store)
    @PostMapping("/{quizId}/save-question")
    public String saveQuestion(@PathVariable Long quizId, @ModelAttribute Question question) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            question.setQuiz(quiz);
            quiz.getQuestions().add(question);
            quizService.saveQuiz(quiz); // Simpan quiz beserta soal baru
        }
        return "redirect:/quiz/manage"; // Redirect ke halaman manage quizzes
    }

    @GetMapping("/{quizId}/edit")
    public String editQuizForm(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            // Format the startTime and endTime to a format compatible with datetime-local
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            String formattedStartTime = quiz.getStartTime() != null ? quiz.getStartTime().format(formatter) : "";
            String formattedEndTime = quiz.getEndTime() != null ? quiz.getEndTime().format(formatter) : "";

            // Pass the formatted times to the model
            model.addAttribute("quiz", quiz);
            model.addAttribute("formattedStartTime", formattedStartTime);
            model.addAttribute("formattedEndTime", formattedEndTime);
            model.addAttribute("questions", quiz.getQuestions());
        }
        return "admin/edit_quiz";
    }



    // Fungsi untuk update Question
    @PostMapping("/{quizId}/update-question/{questionId}")
    public String updateQuestion(@PathVariable Long quizId,
                                 @PathVariable Long questionId,
                                 @RequestParam String questionText,
                                 @RequestParam String correctAnswer) {
        Question question = quizService.getQuestionById(questionId);

        if (question == null) {
            throw new IllegalArgumentException("Question not found");
        }

        // Update data soal
        question.setQuestionText(questionText);
        question.setCorrectAnswer(Boolean.parseBoolean(correctAnswer));

        quizService.saveQuestion(question);

        return "redirect:/quiz/" + quizId + "/edit";
    }

    // Fungsi untuk menampilkan seluruh halaman quiz untuk user
    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        // Get current time
        LocalDateTime now = LocalDateTime.now();

        // Fetch the quiz from the database
        Quiz quiz = quizService.getQuizById(quizId);

        // Check if quiz start time and end time are valid
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

        // Check if the quiz is within the allowed time range
        if (quiz.getStartTime() != null && now.isBefore(quiz.getStartTime())) {
            model.addAttribute("error", "This quiz has not started yet.");
            return "quiz/error";
        }

        if (quiz.getEndTime() != null && now.isAfter(quiz.getEndTime())) {
            model.addAttribute("error", "This quiz has already ended.");
            return "quiz/error";
        }

        // Proceed to the quiz
        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);
        return "quiz/quiz";
    }




    // Fungsi untuk submit quiz
    @PostMapping("/{id}/submit")
    public String submitQuiz(@PathVariable("id") Long quizId,
                             @RequestParam Map<String, String> answers,
                             HttpSession session,
                             Model model) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) {
            return "redirect:/auth/login";
        }

        Quiz quiz = quizService.getQuizById(quizId);
        int score = 0;
        long timeTakenInSeconds = 0;

        LocalDateTime startTime = (LocalDateTime) session.getAttribute("quizStartTime");
        if (startTime != null) {
            timeTakenInSeconds = java.time.Duration.between(startTime, LocalDateTime.now()).getSeconds();
        }

        // Calculate the base score per question
        double baseScorePerQuestion = 100.0 / quiz.getQuestions().size();

        // Calculate bonus based on the time taken
        double bonus = 0.0;
        if (timeTakenInSeconds <= 180) {
            bonus = 0.10 * 100; // Bonus 10 %
        } else if (timeTakenInSeconds <= 240) {
            bonus = 0.05 * 100; // Bonus 5%
        }

        // Cek apakah QuizResult sudah ada
        QuizResult quizResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);
        if (quizResult == null) {
            // If not found, create a new result
            quizResult = new QuizResult();
            quizResult.setUser(currentUser);
            quizResult.setQuiz(quiz);
            quizResult.setStartTime(startTime);
            quizResult.setEndTime(LocalDateTime.now());
            quizResult.setTimeTakenInSeconds(timeTakenInSeconds);
            quizResult.setScore(0); // Temporary score
            quizResultService.saveQuizResult(quizResult);
        }

        // Save answers based on their original order
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            Question question = quiz.getQuestions().get(i);
            String answer = answers.get("answers[" + i + "]");
            Boolean userAnswer = (answer != null) ? Boolean.parseBoolean(answer) : null;

            quizResultService.updateOrSaveUserAnswer(quizResult, question, userAnswer);

            if (userAnswer != null && userAnswer.equals(question.getCorrectAnswer())) {
                score += baseScorePerQuestion;
            }
        }

        score += bonus;

        // Set maks 100
        quizResult.setScore(Math.min((int) score, 100));
        quizResultService.saveQuizResult(quizResult);

        // Add attributes to the model for the result page
        model.addAttribute("quizId", quizId);
        model.addAttribute("userId", currentUser.getId());
        model.addAttribute("score", Math.min((int) score, 100)); // Ensure the max score is 100
        model.addAttribute("timeTakenInSeconds", timeTakenInSeconds);
        model.addAttribute("bonus", bonus);

        return "quiz/result";
    }



    // Fungsi untuk menampilkan leaderboard pada quiz tertentu
    @GetMapping("/{id}/leaderboard")
    public String getLeaderboard(@PathVariable("id") Long quizId, Model model) {
        // Validasi apakah quiz ada
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

        // Ambil hasil leaderboard
        List<QuizResult> leaderboard = quizResultService.getLeaderboardByQuiz(quizId);

        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

        return "quiz/leaderboard"; // Menampilkan halaman leaderboard
    }

    // Fungsi untuk review hasil
    @GetMapping("/{quizId}/review/{userId}")
    public String reviewQuiz(@PathVariable Long quizId, @PathVariable Long userId, Model model) {
        // Ambil quiz berdasarkan ID
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

        // Ambil hasil quiz berdasarkan userId dan quizId
        QuizResult quizResult = quizResultService.getQuizResultByUserAndQuiz(userId, quizId);
        if (quizResult == null) {
            throw new IllegalArgumentException("Quiz result not found for user and quiz.");
        }

        // Ambil semua jawaban user untuk quiz result ini
        List<UserAnswer> userAnswers = quizResultService.getUserAnswersByQuizResult(quizResult.getId());
        quizResult.setUserAnswers(userAnswers);

        // Ambil semua question dari quiz
        List<Question> questions = quiz.getQuestions();

        model.addAttribute("quiz", quiz);
        model.addAttribute("questions", questions);
        model.addAttribute("quizResult", quizResult);

        return "quiz/review"; // Halaman review
    }


    // Fungsi untuk update title quiz
    @PostMapping("/{quizId}/update-title")
    public String updateQuiz(@PathVariable Long quizId,
                             @RequestParam("title") String title,
                             @RequestParam("startTime") String startTime,
                             @RequestParam("endTime") String endTime) {
        // Convert startTime and endTime from String to LocalDateTime
        LocalDateTime start = LocalDateTime.parse(startTime);
        LocalDateTime end = LocalDateTime.parse(endTime);

        // Retrieve the existing quiz
        Quiz existingQuiz = quizService.getQuizById(quizId);
        if (existingQuiz != null) {
            existingQuiz.setTitle(title);
            existingQuiz.setStartTime(start);
            existingQuiz.setEndTime(end);
            quizService.saveQuiz(existingQuiz); // Save changes
        }

        return "redirect:/quiz/" + quizId + "/edit"; // Redirect to the quiz edit page
    }


    // Fungsi untuk tambah question berdasarkan quizid
    @GetMapping("/{quizId}/edit-question/{questionId}")
    public String editQuestionForm(@PathVariable Long quizId,
                                   @PathVariable Long questionId,
                                   Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        Question question = quizService.getQuestionById(questionId);

        if (quiz == null || question == null) {
            throw new IllegalArgumentException("Quiz or Question not found");
        }

        model.addAttribute("quiz", quiz);
        model.addAttribute("question", question);

        return "admin/edit_question"; // Path ke template yang benar
    }


    // Fungsi untuk delete Question
    @PostMapping("/{quizId}/question/{questionId}/delete")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        quizService.deleteQuestion(questionId);
        return "redirect:/quiz/" + quizId + "/edit"; // Kembali ke halaman edit quiz
    }

    // Fungsi untuk delete Quiz
    @PostMapping("/{quizId}/delete")
    public String deleteQuiz(@PathVariable Long quizId) {
        quizService.deleteQuizById(quizId);
        return "redirect:/quiz/manage"; // Kembali ke halaman manage quizzes
    }




}
