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
import java.util.*;

import com.quiz.tubespbo.model.Question;

import java.time.LocalDateTime;

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
            model.addAttribute("question", new Question());
        }
        return "admin/add_question"; // Nama template untuk form tambah soal
    }

    // Fungsi untuk menyimpan question (store)
    @PostMapping("/{quizId}/save-question")
    public String saveQuestion(@PathVariable Long quizId, @ModelAttribute Question question) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            question.setQuiz(quiz);
            quizService.saveQuestion(question);
        }
        return "redirect:/quiz/" + quizId + "/edit";
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
    public String updateQuestion(@PathVariable Long quizId, @PathVariable Long questionId,
                                 @ModelAttribute Question updatedQuestion) {
        Question question = quizService.getQuestionById(questionId);
        if (question != null) {
            question.setQuestionText(updatedQuestion.getQuestionText());
            question.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
            question.setDuration(updatedQuestion.getDuration());
            quizService.saveQuestion(question);
        }else{
            throw new IllegalArgumentException("Question not found");
        }
        return "redirect:/quiz/" + quizId + "/edit";
    }

    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        // Retrieve the logged-in user
        User user = (User) session.getAttribute("currentUser");
        if (user == null) {
            return "redirect:/auth/login"; // Redirect to login if no user is logged in
        }

        LocalDateTime now = LocalDateTime.now();
        Quiz quiz = quizService.getQuizById(quizId);

        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found.");
        }

        List<Question> shuffledQuestions = quiz.getQuestions();
        Collections.shuffle(shuffledQuestions);

        // Create and save a new QuizResult for the user
        QuizResult quizResult = new QuizResult();
        quizResult.setQuiz(quiz);
        quizResult.setUser(user); // Associate the user with the result
        quizResult.setStartTime(now);
        quizResultService.saveQuizResult(quizResult);

        // Store quiz details in session
        session.setAttribute("shuffledQuestions", shuffledQuestions);
        session.setAttribute("quizStartTime", now);
        session.setAttribute("currentQuestionIndex", 0);
        session.setAttribute("totalScore", 0);
        session.setAttribute("quizResult", quizResult);

        model.addAttribute("quiz", quiz);
        model.addAttribute("shuffledQuestions", shuffledQuestions);
        return "quiz/quiz";
    }


    @PostMapping("/submit-question")
    @ResponseBody
    public Map<String, Object> submitQuestion(
            @RequestParam("questionIndex") int questionIndex,
            @RequestParam("userAnswer") boolean userAnswer,
            @RequestParam("timeLeft") int timeLeft,
            HttpSession session) {

        List<Question> shuffledQuestions = (List<Question>) session.getAttribute("shuffledQuestions");
        Question question = shuffledQuestions.get(questionIndex);

        QuizResult quizResult = (QuizResult) session.getAttribute("quizResult");
        Quiz quiz = quizResult.getQuiz();
        int totalScore = (int) session.getAttribute("totalScore");

//        Question question = quiz.getQuestions().get(questionIndex);
        boolean isCorrect = userAnswer == question.getCorrectAnswer();

        // Calculate the score
        int questionScore = isCorrect ? (int) ((timeLeft / (double) question.getDuration()) * 1000) : 0;
        totalScore += questionScore;
        session.setAttribute("totalScore", totalScore);

        // Save UserAnswer
        UserAnswer userAnswerEntity = new UserAnswer(
                quizResult, question, userAnswer, (long) (question.getDuration() - timeLeft), questionScore
        );
        quizResultService.saveUserAnswer(userAnswerEntity);

        // Prepare response
        Map<String, Object> response = new HashMap<>();
        response.put("isCorrect", isCorrect);
        response.put("correctAnswer", question.getCorrectAnswer() ? "True" : "False");
        response.put("questionScore", questionScore);
        response.put("totalScore", totalScore);
        response.put("isLastQuestion", questionIndex == shuffledQuestions.size() - 1);

        return response;
    }


    @PostMapping("/{id}/submit")
    public String submitQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        LocalDateTime now = LocalDateTime.now();

        QuizResult quizResult = (QuizResult) session.getAttribute("quizResult");
        int totalScore = (int) session.getAttribute("totalScore");

        quizResult.setEndTime(now);
        quizResult.setScore(totalScore);
        quizResult.setTimeTakenInSeconds(
                java.time.Duration.between(quizResult.getStartTime(), now).toSeconds()
        );
        quizResultService.saveQuizResult(quizResult);

        model.addAttribute("quizId", quizId); // Kirim quizId ke template
        model.addAttribute("score", totalScore);
        model.addAttribute("timeTaken", quizResult.getTimeTakenInSeconds());

        return "/quiz/result";
    }


//     Fungsi untuk review hasil
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
    public String editQuestionForm(@PathVariable Long quizId, @PathVariable Long questionId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        Question question = quizService.getQuestionById(questionId);
        if (quiz != null && question != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("question", question);
        }else{
            throw new IllegalArgumentException("Quiz or Question not found");
        }
        return "admin/edit_question"; // Nama template untuk form edit soal
    }

    // Fungsi untuk delete Question
    @PostMapping("/{quizId}/delete-question/{questionId}")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        quizService.deleteQuestion(questionId);
        return "redirect:/quiz/" + quizId + "/edit";
    }

    // Fungsi untuk delete Quiz
    @PostMapping("/{quizId}/delete")
    public String deleteQuiz(@PathVariable Long quizId) {
        quizService.deleteQuizById(quizId);
        return "redirect:/quiz/manage"; // Kembali ke halaman manage quizzes
    }

    // Method to display leaderboard
    @GetMapping("/{quizId}/leaderboard")
    public String getLeaderboard(@PathVariable Long quizId, Model model) {
        if (quizId == null) {
            throw new IllegalArgumentException("Quiz ID cannot be null.");
        }

        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found.");
        }

        List<QuizResult> leaderboard = quizResultService.getLeaderboardForQuiz(quizId);
        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

        return "quiz/leaderboard";
    }

    @GetMapping("/{quizId}/admin-leaderboard")
    public String viewAdminLeaderboard(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found.");
        }

        List<QuizResult> leaderboard = quizResultService.getLeaderboardForQuiz(quizId);
        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

        return "admin/leaderboard";
    }

}
