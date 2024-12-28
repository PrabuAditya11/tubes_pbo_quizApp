package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.repo.QuizResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizResultService {

    @Autowired
    private QuizResultRepository quizResultRepository;

    // Menyimpan hasil quiz ke dalam database
    public QuizResult saveQuizResult(QuizResult quizResult) {
        return quizResultRepository.save(quizResult);
    }

    // Mendapatkan hasil quiz berdasarkan ID
    public QuizResult getQuizResultById(Long id) {
        return quizResultRepository.findById(id).orElse(null);
    }

    // Mendapatkan hasil quiz berdasarkan User ID dan Quiz ID
    public QuizResult getQuizResultByUserAndQuiz(Long userId, Long quizId) {
        return quizResultRepository.findByUserIdAndQuizId(userId, quizId);
    }
}

