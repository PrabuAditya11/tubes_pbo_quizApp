package com.quiz.tubespbo.repo;

import com.quiz.tubespbo.model.QuizResult;
<<<<<<< HEAD
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
=======
<<<<<<< HEAD
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
=======
<<<<<<< HEAD
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
=======
import org.springframework.data.jpa.repository.JpaRepository;
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
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {

<<<<<<< HEAD
    // Mencari hasil quiz
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);

=======
<<<<<<< HEAD
    // Mencari hasil quiz
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);

=======
<<<<<<< HEAD
    // Mencari hasil quiz
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);

=======
<<<<<<< HEAD
    // Mencari hasil quiz
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);


>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
    // Mendapatkan leaderboard
    @Query("SELECT r FROM QuizResult r WHERE r.quiz.id = :quizId " +
            "AND r.score = (SELECT MAX(sub.score) FROM QuizResult sub WHERE sub.user.id = r.user.id AND sub.quiz.id = :quizId) " +
            "AND r.timeTakenInSeconds = (SELECT MIN(sub.timeTakenInSeconds) FROM QuizResult sub WHERE sub.user.id = r.user.id AND sub.quiz.id = :quizId AND sub.score = r.score) " +
            "ORDER BY r.score DESC, r.timeTakenInSeconds ASC")
    List<QuizResult> findLeaderboardByQuizId(@Param("quizId") Long quizId);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
    @Transactional
    @Modifying
    @Query("DELETE FROM QuizResult q WHERE q.quiz.id = :quizId")
    void deleteByQuizId(@Param("quizId") Long quizId);

    List<QuizResult> findByQuizId(Long quizId);
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    // Mencari hasil quiz
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);

    // Mendapatkan leaderboard
    @Query("SELECT q FROM QuizResult q WHERE q.quiz.id = :quizId ORDER BY q.score DESC, q.timeTakenInSeconds ASC")
    List<QuizResult> findTopResultsByQuizId(@Param("quizId") Long quizId);
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
    // Mencari hasil quiz berdasarkan User ID dan Quiz ID
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);

    // Mendapatkan leaderboard berdasarkan Quiz ID
    @Query("SELECT q FROM QuizResult q WHERE q.quiz.id = :quizId ORDER BY q.score DESC, q.timeTakenInSeconds ASC")
    List<QuizResult> findTopResultsByQuizId(@Param("quizId") Long quizId);
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
import org.springframework.stereotype.Repository;

@Repository
public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {

    // Mencari hasil quiz berdasarkan ID user dan ID quiz
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);
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
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
