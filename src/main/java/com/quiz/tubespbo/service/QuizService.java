package com.quiz.tubespbo.service;

<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
=======
import com.quiz.tubespbo.model.Quiz;
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
import com.quiz.tubespbo.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

<<<<<<< HEAD
    @Autowired
    private QuestionRepository questionRepository;

    public List<Quiz> getAvailableQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long quizId) {
        return quizRepository.findById(quizId).orElse(null);
    }

    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId).orElse(null);
    }

    public void saveQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    public void deleteQuestion(Long questionId) {
        questionRepository.deleteById(questionId);
    }
}
=======
<<<<<<< HEAD
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


=======
    // Method to get all available quizzes
    public List<Quiz> getAvailableQuizzes() {
        return quizRepository.findAll();  // Mengambil semua quiz yang tersedia di database
    }

    // Method to get a specific quiz by its ID
    public Quiz getQuizById(Long quizId) {
        return quizRepository.findById(quizId).orElse(null);  // Mencari quiz berdasarkan ID
    }

    // Method to save a quiz
    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);  // Menyimpan quiz ke database
    }

    // Additional methods for handling quiz operations can be added here
}

>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
