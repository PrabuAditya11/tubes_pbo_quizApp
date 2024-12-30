package com.quiz.tubespbo.repo;

import com.quiz.tubespbo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
<<<<<<< HEAD

=======
    // JpaRepository secara otomatis menyediakan metode seperti findById, findAll, save, deleteById, dll.
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
}
