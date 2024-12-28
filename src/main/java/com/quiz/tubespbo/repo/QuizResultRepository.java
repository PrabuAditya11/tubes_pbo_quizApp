package com.quiz.tubespbo.repo;

import com.quiz.tubespbo.model.QuizResult;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {

    // Mencari hasil quiz berdasarkan User ID dan Quiz ID
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);

    // Mendapatkan leaderboard berdasarkan Quiz ID
    @Query("SELECT q FROM QuizResult q WHERE q.quiz.id = :quizId ORDER BY q.score DESC, q.timeTakenInSeconds ASC")
    List<QuizResult> findTopResultsByQuizId(@Param("quizId") Long quizId);
}
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
