package com.quiz.tubespbo.repo;

import com.quiz.tubespbo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
=======

>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
<<<<<<< HEAD
=======
    Optional<User> findByNimAndPassword(String nim, String password);
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
    User findByNim(String nim);
}
