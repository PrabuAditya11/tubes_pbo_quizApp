package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.repo.QuizResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e

@Service
public class QuizResultService {

    @Autowired
    private QuizResultRepository quizResultRepository;

<<<<<<< HEAD
    public void updateQuizResult(QuizResult existingResult, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds, List<Boolean> answers) {
        existingResult.setScore(score);
        existingResult.setStartTime(startTime);
        existingResult.setEndTime(endTime);
        existingResult.setTimeTakenInSeconds(timeTakenInSeconds);
        existingResult.setAnswers(answers); // Simpan jawaban user selama runtime
        quizResultRepository.save(existingResult);
    }

    // Menyimpan hasil quiz ke dalam database
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds, List<Boolean> answers) {
=======
    // Menyimpan hasil quiz ke dalam database
<<<<<<< HEAD
=======
    // Menyimpan hasil quiz ke dalam database
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
    public QuizResult saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
        QuizResult newResult = new QuizResult();
        newResult.setUser(user);
        newResult.setQuiz(quiz);
        newResult.setScore(score);
        newResult.setStartTime(startTime);
        newResult.setEndTime(endTime);
        newResult.setTimeTakenInSeconds(timeTakenInSeconds);
<<<<<<< HEAD
        newResult.setAnswers(answers); // Simpan jawaban user selama runtime
        quizResultRepository.save(newResult);
    }


=======
        return quizResultRepository.save(newResult);
    }

    // Memperbarui hasil quiz yang sudah ada
    public void updateQuizResult(QuizResult existingResult, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
        existingResult.setScore(score);
        existingResult.setStartTime(startTime);
        existingResult.setEndTime(endTime);
        existingResult.setTimeTakenInSeconds(timeTakenInSeconds);
        quizResultRepository.save(existingResult); // Update dengan menyimpan objek yang sudah diubah
    }
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e

    // Mendapatkan hasil quiz berdasarkan ID
    public QuizResult getQuizResultById(Long id) {
        return quizResultRepository.findById(id).orElse(null);
    }

    // Mendapatkan hasil quiz berdasarkan User ID dan Quiz ID
    public QuizResult getQuizResultByUserAndQuiz(Long userId, Long quizId) {
        return quizResultRepository.findByUserIdAndQuizId(userId, quizId);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e

    // Mendapatkan leaderboard berdasarkan Quiz ID
    public List<QuizResult> getLeaderboardByQuiz(Long quizId) {
        return quizResultRepository.findTopResultsByQuizId(quizId);
    }
}
<<<<<<< HEAD
=======
=======
}

>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
