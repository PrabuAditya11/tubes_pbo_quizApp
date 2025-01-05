package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.User;
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
import com.quiz.tubespbo.model.UserAnswer;
import com.quiz.tubespbo.repo.QuizResultRepository;
import com.quiz.tubespbo.repo.UserAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quiz.tubespbo.model.Question;


import java.time.LocalDateTime;
import java.util.List;
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
=======
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a

@Service
public class QuizResultService {

    @Autowired
    private QuizResultRepository quizResultRepository;

<<<<<<< HEAD
    @Autowired
    private UserAnswerRepository userAnswerRepository;

=======
<<<<<<< HEAD
    @Autowired
    private UserAnswerRepository userAnswerRepository;

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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @Autowired
    private UserAnswerRepository userAnswerRepository;

    // Update Quiz Result
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
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
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
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    public void updateQuizResult(QuizResult existingResult, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds, List<Boolean> answers) {
        existingResult.setScore(score);
        existingResult.setStartTime(startTime);
        existingResult.setEndTime(endTime);
        existingResult.setTimeTakenInSeconds(timeTakenInSeconds);
<<<<<<< HEAD
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers); // Remove if answers are now stored in UserAnswer
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers);
=======
<<<<<<< HEAD
        existingResult.setAnswers(answers);
=======
        existingResult.setAnswers(answers); // Simpan jawaban user selama runtime
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
        quizResultRepository.save(existingResult);
    }

    // Menyimpan hasil quiz ke dalam database
<<<<<<< HEAD
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
=======
<<<<<<< HEAD
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
=======
<<<<<<< HEAD
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
=======
<<<<<<< HEAD
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
=======
<<<<<<< HEAD
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
=======
<<<<<<< HEAD
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
=======
<<<<<<< HEAD
    public void saveQuizResult(User user, Quiz quiz, int score, LocalDateTime startTime, LocalDateTime endTime, long timeTakenInSeconds) {
=======
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
        QuizResult newResult = new QuizResult();
        newResult.setUser(user);
        newResult.setQuiz(quiz);
        newResult.setScore(score);
        newResult.setStartTime(startTime);
        newResult.setEndTime(endTime);
        newResult.setTimeTakenInSeconds(timeTakenInSeconds);
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
        quizResultRepository.save(newResult);
    }

    // Menyimpan jawaban user ke dalam tabel UserAnswer
    public void saveUserAnswers(QuizResult quizResult, List<UserAnswer> userAnswers) {
        for (UserAnswer userAnswer : userAnswers) {
            userAnswer.setQuizResult(quizResult); // Relasikan ke QuizResult
            userAnswerRepository.save(userAnswer);
        }
    }

<<<<<<< HEAD
    // Mendapatkan hasil quiz berdasarkan User ID dan Quiz ID
//    public QuizResult getQuizResultByUserAndQuiz(Long userId, Long quizId) {
//        return quizResultRepository.findByUserIdAndQuizId(userId, quizId);
//    }
    public QuizResult getQuizResultByUserAndQuiz(Long userId, Long quizId) {
        return quizResultRepository.findByUserIdAndQuizId(userId, quizId);
    }

    // Method to get leaderboard for a specific quiz
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    public List<QuizResult> getLeaderboardForQuiz(Long quizId) {
        return quizResultRepository.findLeaderboardByQuizId(quizId);
    }

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
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
        newResult.setAnswers(answers);
        quizResultRepository.save(newResult);
    }

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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb

    // Mendapatkan leaderboard berdasarkan Quiz ID
    public List<QuizResult> getLeaderboardByQuiz(Long quizId) {
        return quizResultRepository.findTopResultsByQuizId(quizId);
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3

    // Mendapatkan jawaban user berdasarkan QuizResult ID
    public List<UserAnswer> getUserAnswersByQuizResult(Long quizResultId) {
        return userAnswerRepository.findByQuizResultId(quizResultId);
    }


>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    public void saveQuizResult(QuizResult quizResult) {
        quizResultRepository.save(quizResult);
    }

    public void saveUserAnswer(UserAnswer userAnswer) {
        userAnswerRepository.save(userAnswer);
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
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
<<<<<<< HEAD
=======
=======
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
