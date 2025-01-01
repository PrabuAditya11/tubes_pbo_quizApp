package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.model.UserAnswer;
import com.quiz.tubespbo.repo.QuizResultRepository;
import com.quiz.tubespbo.repo.UserAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quiz.tubespbo.model.Question;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class QuizResultService {

    @Autowired
    private QuizResultRepository quizResultRepository;

    @Autowired
    private UserAnswerRepository userAnswerRepository;

    // Update Quiz Result
    public void updateQuizResult(QuizResult existingResult, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds, List<Boolean> answers) {
        existingResult.setScore(score);
        existingResult.setStartTime(startTime);
        existingResult.setEndTime(endTime);
        existingResult.setTimeTakenInSeconds(timeTakenInSeconds);
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
        quizResultRepository.save(existingResult);
    }

    // Menyimpan hasil quiz ke dalam database
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
        QuizResult newResult = new QuizResult();
        newResult.setUser(user);
        newResult.setQuiz(quiz);
        newResult.setScore(score);
        newResult.setStartTime(startTime);
        newResult.setEndTime(endTime);
        newResult.setTimeTakenInSeconds(timeTakenInSeconds);
        quizResultRepository.save(newResult);
    }

    // Menyimpan jawaban user ke dalam tabel UserAnswer
    public void saveUserAnswers(QuizResult quizResult, List<UserAnswer> userAnswers) {
        for (UserAnswer userAnswer : userAnswers) {
            userAnswer.setQuizResult(quizResult); // Relasikan ke QuizResult
            userAnswerRepository.save(userAnswer);
        }
    }

    // Mendapatkan hasil quiz berdasarkan User ID dan Quiz ID
//    public QuizResult getQuizResultByUserAndQuiz(Long userId, Long quizId) {
//        return quizResultRepository.findByUserIdAndQuizId(userId, quizId);
//    }
    public QuizResult getQuizResultByUserAndQuiz(Long userId, Long quizId) {
        return quizResultRepository.findByUserIdAndQuizId(userId, quizId);
    }

    // Method to get leaderboard for a specific quiz
    public List<QuizResult> getLeaderboardForQuiz(Long quizId) {
        return quizResultRepository.findLeaderboardByQuizId(quizId);
    }


    // Mendapatkan jawaban user berdasarkan QuizResult ID
    public List<UserAnswer> getUserAnswersByQuizResult(Long quizResultId) {
        return userAnswerRepository.findByQuizResultId(quizResultId);
    }


    public void saveQuizResult(QuizResult quizResult) {
        quizResultRepository.save(quizResult);
    }

    public void saveUserAnswer(UserAnswer userAnswer) {
        userAnswerRepository.save(userAnswer);
    }

    public void updateOrSaveUserAnswer(QuizResult quizResult, Question question, Boolean userAnswer) {
        // Cari jawaban user berdasarkan QuizResult dan Question
        UserAnswer existingAnswer = userAnswerRepository.findByQuizResultAndQuestion(quizResult, question);

        if (existingAnswer != null) {
            // Jika sudah ada, update jawaban
            existingAnswer.setUserAnswer(userAnswer);
            userAnswerRepository.save(existingAnswer);
        } else {
            // Jika belum ada, buat data baru
            UserAnswer newAnswer = new UserAnswer();
            newAnswer.setQuizResult(quizResult);
            newAnswer.setQuestion(question);
            newAnswer.setUserAnswer(userAnswer);
            userAnswerRepository.save(newAnswer);
        }
    }

}
