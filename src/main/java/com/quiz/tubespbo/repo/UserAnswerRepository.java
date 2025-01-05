package com.quiz.tubespbo.repo;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
<<<<<<< HEAD
=======
=======
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
=======
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
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
=======
<<<<<<< HEAD
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a

    @Query("SELECT ua FROM UserAnswer ua JOIN FETCH ua.question WHERE ua.quizResult.id = :quizResultId")
    List<UserAnswer> findAllByQuizResultId(@Param("quizResultId") Long quizResultId);

    @Transactional
    @Modifying
    @Query("DELETE FROM UserAnswer u WHERE u.quizResult.id = :quizResultId")
    void deleteByQuizResultId(@Param("quizResultId") Long quizResultId);
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD

    @Query("SELECT ua FROM UserAnswer ua JOIN FETCH ua.question WHERE ua.quizResult.id = :quizResultId")
    List<UserAnswer> findAllByQuizResultId(@Param("quizResultId") Long quizResultId);
=======
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
}
