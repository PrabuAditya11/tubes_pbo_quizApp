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

    /* -------------------------------------------------------------------------------------------------- */
    /*                                         HALAMAN MANAGE                                             */
    /* -------------------------------------------------------------------------------------------------- */

    // Fungsi untuk menampilkan halaman Manage_Quizzes
    @GetMapping("/manage")
    public String manageQuizzes(HttpSession session, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        List<Quiz> quizzes = quizService.getAvailableQuizzes();
        model.addAttribute("quizzes", quizzes);
        return "admin/manage_quizzes";
    }







    /* -------------------------------------------------------------------------------------------------- */
    /*                                            CRUD QUIZ                                               */
    /* -------------------------------------------------------------------------------------------------- */

    // CREATE - FORM
    @GetMapping("/new")
    public String createQuizForm(HttpSession session, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        model.addAttribute("quiz", new Quiz());
        return "admin/create_quiz";
    }

    // CREATE
    @PostMapping("/save")
    public String saveQuiz(@ModelAttribute Quiz quiz) {
        if (quiz.getStartTime() != null && quiz.getEndTime() != null && quiz.getEndTime().isBefore(quiz.getStartTime())) {
            throw new IllegalArgumentException("End time cannot be before start time.");
        }

        quizService.saveQuiz(quiz);
        return "redirect:/quiz/manage";
    }

    // UPDATE - FORM
    @GetMapping("/{quizId}/edit")
    public String editQuizForm(HttpSession session, @PathVariable Long quizId, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            // Inisialisasi Awal
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            String formattedStartTime = quiz.getStartTime() != null ? quiz.getStartTime().format(formatter) : "";
            String formattedEndTime = quiz.getEndTime() != null ? quiz.getEndTime().format(formatter) : "";

            // Masukkan ke model
            model.addAttribute("quiz", quiz);
            model.addAttribute("formattedStartTime", formattedStartTime);
            model.addAttribute("formattedEndTime", formattedEndTime);
            model.addAttribute("questions", quiz.getQuestions());
        }
        return "admin/edit_quiz";
    }

    // UPDATE
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

    // DELETE
    @PostMapping("/{quizId}/delete")
    public String deleteQuiz(@PathVariable Long quizId) {
        quizService.deleteQuizById(quizId);
        return "redirect:/quiz/manage"; // Kembali ke halaman manage quizzes
    }







    /* -------------------------------------------------------------------------------------------------- */
    /*                                           CRUD QUESTION                                            */
    /* -------------------------------------------------------------------------------------------------- */

    // CREATE - FORM
    @GetMapping("/{quizId}/add-question")
    public String addQuestionForm(HttpSession session, @PathVariable Long quizId, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("question", new Question());
        }
        return "admin/add_question";
    }

    // CREATE
    @PostMapping("/{quizId}/save-question")
    public String saveQuestion(@PathVariable Long quizId, @ModelAttribute Question question) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            question.setQuiz(quiz);
            quizService.saveQuestion(question);
        }
        return "redirect:/quiz/" + quizId + "/edit";
    }

    // UPDATE - FORM
    @GetMapping("/{quizId}/edit-question/{questionId}")
    public String editQuestionForm(HttpSession session, @PathVariable Long quizId, @PathVariable Long questionId, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

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

    // UPDATE
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

    // DELETE
    @PostMapping("/{quizId}/delete-question/{questionId}")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        quizService.deleteQuestion(questionId);
        return "redirect:/quiz/" + quizId + "/edit";
    }







    /* -------------------------------------------------------------------------------------------------- */
    /*                                           ATTEMPT QUIZ                                             */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        // Cek Session
        User user = (User) session.getAttribute("currentUser");
        if (user == null) {
            return "redirect:/auth/login";
        }

        // Cek apakah Quiz ada
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found.");
        }

        // Cek apakah Quiz berada diantara akses waktu yang telah ditentukan
        LocalDateTime now = LocalDateTime.now();
        if (quiz.getStartTime() != null && now.isBefore(quiz.getStartTime())) {
            model.addAttribute("error", "This quiz has not started yet.");
            return "quiz/error";
        }

        if (quiz.getEndTime() != null && now.isAfter(quiz.getEndTime())) {
            model.addAttribute("error", "This quiz has already ended.");
            return "quiz/error";
        }

        List<Question> shuffledQuestions = quiz.getQuestions();
        Collections.shuffle(shuffledQuestions);

        // Set QuizResult
        QuizResult quizResult = new QuizResult();
        quizResult.setQuiz(quiz);
        quizResult.setUser(user);
        quizResult.setStartTime(now);
        quizResultService.saveQuizResult(quizResult);

        // Masukkan data ke session
        session.setAttribute("shuffledQuestions", shuffledQuestions);
        session.setAttribute("quizStartTime", now);
        session.setAttribute("currentQuestionIndex", 0);
        session.setAttribute("totalScore", 0);
        session.setAttribute("quizResult", quizResult);

        model.addAttribute("quiz", quiz);
        model.addAttribute("shuffledQuestions", shuffledQuestions);
        return "quiz/quiz";
    }


    /* -------------------------------------------------------------------------------------------------- */
    /*                                        SUBMIT QUESTION                                             */
    /* -------------------------------------------------------------------------------------------------- */

    @PostMapping("/submit-question")
    @ResponseBody
    public Map<String, Object> submitQuestion(
            @RequestParam("questionIndex") int questionIndex,
            @RequestParam("userAnswer") boolean userAnswer,
            @RequestParam("timeLeft") int timeLeft,
            HttpSession session) {

        // Ambil soal acak yang disimpan dalam sesi
        List<Question> shuffledQuestions = (List<Question>) session.getAttribute("shuffledQuestions");
        Question question = shuffledQuestions.get(questionIndex);

        // Ambil hasil quiz
        QuizResult quizResult = (QuizResult) session.getAttribute("quizResult");
        int totalScore = (int) session.getAttribute("totalScore");

        // Cek jawaban user
        boolean isCorrect = userAnswer == question.getCorrectAnswer();

        // Hitung skor soal
        int questionScore = isCorrect ? (int) ((timeLeft / (double) question.getDuration()) * 1000) : 0;
        totalScore += questionScore;

        // Update skor total di sesi
        session.setAttribute("totalScore", totalScore);

        // Simpan jawaban user ke database
        UserAnswer userAnswerEntity = new UserAnswer(
                quizResult, question, userAnswer, (long) (question.getDuration() - timeLeft), questionScore
        );
        quizResultService.saveUserAnswer(userAnswerEntity);

        // Jika ini soal terakhir, perbarui waktu selesai dan hasil akhir
        boolean isLastQuestion = questionIndex == shuffledQuestions.size() - 1;
        if (isLastQuestion) {
            quizResult.setEndTime(LocalDateTime.now());
            quizResult.setScore(totalScore);
            long timeTaken = java.time.Duration.between(quizResult.getStartTime(), LocalDateTime.now()).toSeconds();
            quizResult.setTimeTakenInSeconds(timeTaken);
            quizResultService.saveQuizResult(quizResult);
        }

        // Siapkan respons untuk frontend
        Map<String, Object> response = new HashMap<>();
        response.put("isCorrect", isCorrect);
        response.put("correctAnswer", question.getCorrectAnswer() ? "True" : "False");
        response.put("questionScore", questionScore);
        response.put("totalScore", totalScore);
        response.put("isLastQuestion", isLastQuestion);

        return response;
    }








    /* -------------------------------------------------------------------------------------------------- */
    /*                                           SUBMIT QUIZ                                              */
    /* -------------------------------------------------------------------------------------------------- */

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

    /* -------------------------------------------------------------------------------------------------- */
    /*                                           LEADERBOARD                                              */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/{quizId}/leaderboard")
    public String getLeaderboard(HttpSession session, @PathVariable String quizId, Model model) {
        try {
            Long quizIdLong = Long.parseLong(quizId); // Konversi manual untuk menangani kesalahan input
            User currentUser = (User) session.getAttribute("currentUser");

            Quiz quiz = quizService.getQuizById(quizIdLong);

            if (quiz == null) {
                throw new IllegalArgumentException("Quiz not found.");
            }

            List<QuizResult> leaderboard = quizResultService.getLeaderboardForQuiz(quizIdLong);
            model.addAttribute("quiz", quiz);
            model.addAttribute("leaderboard", leaderboard);

            if (currentUser == null || "admin".equals(currentUser.getRole())) {
                return "admin/leaderboard";
            } else {
                return "quiz/leaderboard";
            }

        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "Invalid quiz ID format: " + quizId);
            return "error/generic_error"; // Halaman error untuk format ID salah
        } catch (IllegalArgumentException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "error/generic_error"; // Halaman error untuk quiz tidak ditemukan
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An unexpected error occurred: " + e.getMessage());
            return "error/generic_error"; // Halaman error generik
        }
    }

    @PostMapping("/{quizId}/clear-participants")
    public String clearParticipants(@PathVariable Long quizId) {
        quizResultService.clearParticipantsByQuizId(quizId);
        return "redirect:/quiz/" + quizId + "/admin-leaderboard"; // Redirect ke halaman edit quiz setelah clear
    }

}
