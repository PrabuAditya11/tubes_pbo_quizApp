package com.quiz.tubespbo.repo;

import com.quiz.tubespbo.model.QuizResult;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {

    // Mencari hasil quiz
    QuizResult findByUserIdAndQuizId(Long userId, Long quizId);

    // Mendapatkan leaderboard
    @Query("SELECT r FROM QuizResult r WHERE r.quiz.id = :quizId " +
            "AND r.score = (SELECT MAX(sub.score) FROM QuizResult sub WHERE sub.user.id = r.user.id AND sub.quiz.id = :quizId) " +
            "AND r.timeTakenInSeconds = (SELECT MIN(sub.timeTakenInSeconds) FROM QuizResult sub WHERE sub.user.id = r.user.id AND sub.quiz.id = :quizId AND sub.score = r.score) " +
            "ORDER BY r.score DESC, r.timeTakenInSeconds ASC")
    List<QuizResult> findLeaderboardByQuizId(@Param("quizId") Long quizId);

    @Transactional
    @Modifying
    @Query("DELETE FROM QuizResult q WHERE q.quiz.id = :quizId")
    void deleteByQuizId(@Param("quizId") Long quizId);

    List<QuizResult> findByQuizId(Long quizId);
}
