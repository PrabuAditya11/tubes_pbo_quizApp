package com.quiz.tubespbo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.quiz.tubespbo.model.UserAnswer;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.Question;


import java.util.List;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
    List<UserAnswer> findByQuizResultId(Long quizResultId);
    UserAnswer findByQuizResultAndQuestion(QuizResult quizResult, Question question);

    @Query("SELECT ua FROM UserAnswer ua JOIN FETCH ua.question WHERE ua.quizResult.id = :quizResultId")
    List<UserAnswer> findAllByQuizResultId(@Param("quizResultId") Long quizResultId);
}
