package com.quiz.tubespbo.service;

import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.model.Admin;
import com.quiz.tubespbo.model.RegularUser;
import com.quiz.tubespbo.repo.UserRepository;
import com.quiz.tubespbo.repo.AdminRepository;
import com.quiz.tubespbo.repo.RegularUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RegularUserRepository regularUserRepository;

    // Autentikasi pengguna berdasarkan NIM dan password
    public User authenticate(String nim, String password) {
        User user = userRepository.findByNim(nim);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    // Mengecek apakah NIM sudah ada
    public boolean existsByNim(String nim) {
        return userRepository.findByNim(nim) != null;
    }

    // Menyimpan Admin (sekaligus User)
    public void saveAdmin(String name, String nim, String password) {
        // Buat Admin sebagai subclass dari User
        Admin admin = new Admin();
        admin.setName(name);
        admin.setNim(nim);
        admin.setPassword(password);
        admin.setRole("admin"); // Tetapkan role sebagai admin

        userRepository.save(admin); // Simpan ke database
    }

    // Menyimpan Regular User (sekaligus User)
    public void saveRegularUser(String name, String nim, String password) {
        // Buat RegularUser sebagai subclass dari User
        RegularUser regularUser = new RegularUser();
        regularUser.setName(name);
        regularUser.setNim(nim);
        regularUser.setPassword(password);
        regularUser.setRole("user"); // Tetapkan role sebagai user

        userRepository.save(regularUser); // Simpan ke database
    }
}
