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
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627

@Service
public class QuizResultService {

    @Autowired
    private QuizResultRepository quizResultRepository;

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
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
    public void updateQuizResult(QuizResult existingResult, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds, List<Boolean> answers) {
        existingResult.setScore(score);
        existingResult.setStartTime(startTime);
        existingResult.setEndTime(endTime);
        existingResult.setTimeTakenInSeconds(timeTakenInSeconds);
<<<<<<< HEAD
        existingResult.setAnswers(answers);
=======
        existingResult.setAnswers(answers); // Simpan jawaban user selama runtime
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
        quizResultRepository.save(existingResult);
    }

    // Menyimpan hasil quiz ke dalam database
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds, List<Boolean> answers) {
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
=======
    // Menyimpan hasil quiz ke dalam database
<<<<<<< HEAD
=======
    // Menyimpan hasil quiz ke dalam database
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
    public QuizResult saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
        QuizResult newResult = new QuizResult();
        newResult.setUser(user);
        newResult.setQuiz(quiz);
        newResult.setScore(score);
        newResult.setStartTime(startTime);
        newResult.setEndTime(endTime);
        newResult.setTimeTakenInSeconds(timeTakenInSeconds);
<<<<<<< HEAD
        newResult.setAnswers(answers);
        quizResultRepository.save(newResult);
    }

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
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        newResult.setAnswers(answers); // Simpan jawaban user selama runtime
        quizResultRepository.save(newResult);
    }


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
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8

    // Mendapatkan hasil quiz berdasarkan ID
    public QuizResult getQuizResultById(Long id) {
        return quizResultRepository.findById(id).orElse(null);
    }

>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
    // Mendapatkan hasil quiz berdasarkan User ID dan Quiz ID
    public QuizResult getQuizResultByUserAndQuiz(Long userId, Long quizId) {
        return quizResultRepository.findByUserIdAndQuizId(userId, quizId);
    }
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
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627

    // Mendapatkan leaderboard berdasarkan Quiz ID
    public List<QuizResult> getLeaderboardByQuiz(Long quizId) {
        return quizResultRepository.findTopResultsByQuizId(quizId);
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
}

>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
