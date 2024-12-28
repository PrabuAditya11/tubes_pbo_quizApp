package com.quiz.tubespbo.controller;

import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.service.QuizResultService;
import com.quiz.tubespbo.service.QuizService;
import com.quiz.tubespbo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuizResultService quizResultService;

    @Autowired
    private UserService userService;

    // Menampilkan halaman quiz untuk user
    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        LocalDateTime startTime = LocalDateTime.now();
        session.setAttribute("quizStartTime", startTime);
        if (quizId == null) {
            throw new IllegalArgumentException("Quiz ID cannot be null");
        }

        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) {
            return "redirect:/auth/login";
        }

        Quiz quiz = quizService.getQuizById(quizId);
        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);
        return "quiz/quiz";
    }

    // Memproses jawaban setelah user submit
    @PostMapping("/{id}/submit")
    public String submitQuiz(@PathVariable("id") Long quizId,
                             @RequestParam Map<String, String> answers, // Menggunakan Map untuk menangkap jawaban
                             HttpSession session,
                             Model model) {
        // Mendapatkan data user dari session
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) {
            return "redirect:/auth/login";
        }

        // Mendapatkan quiz berdasarkan ID
        Quiz quiz = quizService.getQuizById(quizId);
        int score = 0;
        long timeTakenInSeconds = 0;

        // Hitung skor berdasarkan jawaban yang benar
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            String answer = answers.get("answers[" + i + "]"); // Mendapatkan jawaban berdasarkan indeks
            Boolean correctAnswer = quiz.getQuestions().get(i).getCorrectAnswer();
            if (Boolean.parseBoolean(answer) == correctAnswer) {
                score += 10;  // Misalnya, setiap jawaban benar diberi 10 poin
            }
        }

        // Skor maksimum 100
        score *= 2;
        if (score > 100) {
            score = 100;
        }

        // Mendapatkan waktu mulai dan menghitung waktu yang dibutuhkan
        LocalDateTime startTime = (LocalDateTime) session.getAttribute("quizStartTime");
        if (startTime != null) {
            timeTakenInSeconds = java.time.Duration.between(startTime, LocalDateTime.now()).getSeconds();
        }

        // Cek apakah hasil quiz sudah ada berdasarkan userId dan quizId
        QuizResult existingResult = quizResultService.getQuizResultByUserAndQuiz(quizId, currentUser.getId());

        if (existingResult != null) {
            // Jika hasil sudah ada, lakukan update
            quizResultService.updateQuizResult(existingResult, score, startTime, LocalDateTime.now(), timeTakenInSeconds);
        } else {
            // Jika tidak ada hasil sebelumnya, simpan sebagai hasil baru
            quizResultService.saveQuizResult(currentUser, quiz, score, startTime, LocalDateTime.now(), timeTakenInSeconds);
        }

        model.addAttribute("score", score);
        model.addAttribute("timeTakenInSeconds", timeTakenInSeconds);

        return "quiz/result";
    }


}