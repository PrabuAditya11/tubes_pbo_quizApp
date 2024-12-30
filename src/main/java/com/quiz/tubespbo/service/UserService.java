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
=======
<<<<<<< HEAD
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2

    public boolean existsByNim(String nim) {
        return userRepository.findByNim(nim) != null;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}

<<<<<<< HEAD
=======
=======
}
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
