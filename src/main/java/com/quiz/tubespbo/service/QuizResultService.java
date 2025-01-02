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

    public List<QuizResult> getLeaderboardForQuiz(Long quizId) {
        return quizResultRepository.findLeaderboardByQuizId(quizId);
    }

    public void saveQuizResult(QuizResult quizResult) {
        quizResultRepository.save(quizResult);
    }

    public void saveUserAnswer(UserAnswer userAnswer) {
        userAnswerRepository.save(userAnswer);
    }

    public void clearParticipantsByQuizId(Long quizId) {
        // Cari semua QuizResult berdasarkan quizId
        List<QuizResult> quizResults = quizResultRepository.findByQuizId(quizId);

        // Hapus semua UserAnswer yang terkait dengan QuizResult
        for (QuizResult quizResult : quizResults) {
            userAnswerRepository.deleteByQuizResultId(quizResult.getId());
        }

        // Hapus semua QuizResult terkait quizId
        quizResultRepository.deleteByQuizId(quizId);
    }

}
