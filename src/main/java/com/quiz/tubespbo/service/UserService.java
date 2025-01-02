package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User authenticate(String nim, String password) {
        User user = userRepository.findByNim(nim);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean existsByNim(String nim) {
        return userRepository.findByNim(nim) != null;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
