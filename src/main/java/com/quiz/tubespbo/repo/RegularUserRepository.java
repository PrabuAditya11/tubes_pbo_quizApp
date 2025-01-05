package com.quiz.tubespbo.repo;

import com.quiz.tubespbo.model.RegularUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegularUserRepository extends JpaRepository<RegularUser, Long> {
}
