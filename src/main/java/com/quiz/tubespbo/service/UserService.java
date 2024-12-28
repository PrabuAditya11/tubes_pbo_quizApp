package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User validateUser(String nim, String password) {
        return userRepository.findByNimAndPassword(nim, password)
                .orElse(null);
    }

    public User authenticate(String nim, String password) {
        User user = userRepository.findByNim(nim);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
<<<<<<< HEAD

    public boolean existsByNim(String nim) {
        return userRepository.findByNim(nim) != null;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}

=======
}
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
