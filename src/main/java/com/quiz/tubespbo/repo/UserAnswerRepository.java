package com.quiz.tubespbo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
=======
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
import org.springframework.stereotype.Repository;
import com.quiz.tubespbo.model.UserAnswer;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.Question;


import java.util.List;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
    List<UserAnswer> findByQuizResultId(Long quizResultId);
    UserAnswer findByQuizResultAndQuestion(QuizResult quizResult, Question question);
<<<<<<< HEAD

    @Query("SELECT ua FROM UserAnswer ua JOIN FETCH ua.question WHERE ua.quizResult.id = :quizResultId")
    List<UserAnswer> findAllByQuizResultId(@Param("quizResultId") Long quizResultId);
=======
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
}
