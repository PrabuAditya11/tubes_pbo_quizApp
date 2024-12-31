package com.quiz.tubespbo.controller;

import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // Fungsi untuk return ke halaman login page
    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

    // Fungsi Login
    @PostMapping("/login")
    public String login(String nim, String password, HttpSession session, Model model) {
        User user = userService.authenticate(nim, password);
        if (user != null) {
            session.setAttribute("currentUser", user);

            // Role
            if ("admin".equals(user.getRole())) {
                return "redirect:/admin/dashboard_admin";
            } else {
                return "redirect:/user/dashboard";
            }
        } else {
            model.addAttribute("error", "Invalid NIM or Password");
            return "auth/login";
        }
    }

    // Fungsi untuk return ke halaman register
    @GetMapping("/register")
    public String registerPage() {
        return "auth/register";
    }

    // Fungsi Register
    @PostMapping("/register")
    public String register(String name, String nim, String password, String role, Model model) {
        if (userService.existsByNim(nim)) {
            model.addAttribute("error", "NIM sudah ada");
            return "auth/register";
        }

        User user = new User();
        user.setName(name);
        user.setNim(nim);
        user.setPassword(password);
        user.setRole(role);
        userService.saveUser(user);

        return "redirect:/auth/login";
    }

    // Fungsi logout dan destroy session
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/auth/login";
    }
}


