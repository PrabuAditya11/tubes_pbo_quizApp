package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> getAvailableQuizzes() {
        return quizRepository.findAll(); // Ambil semua quiz
    }

    public Quiz getQuizById(Long quizId) {
        return quizRepository.findById(quizId).orElse(null); // Cari quiz berdasarkan ID
    }

    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz); // Simpan quiz beserta relasi soal
    }
}


