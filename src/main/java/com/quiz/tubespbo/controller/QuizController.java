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

        // Fetch the quiz by ID
        Quiz quiz = quizService.getQuizById(quizId);

        // Shuffle the questions to randomize their order
        Collections.shuffle(quiz.getQuestions());

        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);

        return "quiz/quiz";
    }

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

        List<Boolean> userAnswers = new ArrayList<>();
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            String answer = answers.get("answers[" + i + "]");
            Boolean correctAnswer = quiz.getQuestions().get(i).getCorrectAnswer();
            userAnswers.add(Boolean.parseBoolean(answer)); // Simpan jawaban user

            if (Boolean.parseBoolean(answer) == correctAnswer) {
                score += 10;
            }
        }

        score *= 2;
        LocalDateTime startTime = (LocalDateTime) session.getAttribute("quizStartTime");
        if (startTime != null) {
            timeTakenInSeconds = java.time.Duration.between(startTime, LocalDateTime.now()).getSeconds();
        }

        if (timeTakenInSeconds <= 10) {
            score += 90;
        } else if (timeTakenInSeconds <= 30) {
            score += 50;
        } else if (timeTakenInSeconds <= 50) {
            score += 10;
        }

        QuizResult existingResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);
        if (existingResult != null) {
            quizResultService.updateQuizResult(existingResult, score, startTime, LocalDateTime.now(), timeTakenInSeconds, userAnswers);
        } else {
            quizResultService.saveQuizResult(currentUser, quiz, score, startTime, LocalDateTime.now(), timeTakenInSeconds, userAnswers);
        }

        // Tambahkan quizId dan userId ke model
        model.addAttribute("quizId", quizId);
        model.addAttribute("userId", currentUser.getId());
        model.addAttribute("score", score);
        model.addAttribute("timeTakenInSeconds", timeTakenInSeconds);

        return "quiz/result";
    }



    // Menampilkan leaderboard untuk quiz tertentu
    @GetMapping("/{id}/leaderboard")
    public String getLeaderboard(@PathVariable("id") Long quizId, Model model) {
        // Validasi apakah quiz ada
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

        // Ambil hasil leaderboard berdasarkan quiz ID
        List<QuizResult> leaderboard = quizResultService.getLeaderboardByQuiz(quizId);

        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

        return "quiz/leaderboard"; // Menampilkan halaman leaderboard
    }

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

        // Debugging: periksa nilai "answers"
        System.out.println("Answers: " + quizResult.getAnswers());

        // Ambil semua pertanyaan dari quiz
        List<Question> questions = quiz.getQuestions();

        model.addAttribute("quiz", quiz);
        model.addAttribute("questions", questions);
        model.addAttribute("quizResult", quizResult);

        return "quiz/review"; // Halaman review
    }

}
