package com.quiz.tubespbo.service;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
import com.quiz.tubespbo.repo.QuizRepository;
import jakarta.transaction.Transactional;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.repo.QuestionRepository;
=======
import com.quiz.tubespbo.model.Quiz;
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
import com.quiz.tubespbo.repo.QuizRepository;
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb

    // Metode untuk menghapus quiz berdasarkan ID
    @Transactional
    public void deleteQuizById(Long quizId) {
        // Retrieve the quiz from the database
        Quiz quiz = quizRepository.findById(quizId).orElseThrow(() -> new IllegalArgumentException("Quiz not found"));

        // The related QuizResult entries will automatically be deleted due to cascade settings in the Quiz model.
        quizRepository.delete(quiz); // This will delete the quiz and the related quizResults and questions due to CascadeType.ALL
    }
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2

    // Metode untuk menghapus quiz berdasarkan ID
    public void deleteQuizById(Long quizId) {
        quizRepository.deleteById(quizId);
    }
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
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
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
