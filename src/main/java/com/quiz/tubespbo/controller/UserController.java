package com.quiz.tubespbo.controller;

import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.service.QuizService;
import com.quiz.tubespbo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private QuizService quizService;

    /* -------------------------------------------------------------------------------------------------- */
    /*                                             DASHBOARD                                              */
    /* -------------------------------------------------------------------------------------------------- */

    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
    @GetMapping("/dashboard")
    public String userDashboard(HttpSession session, Model model) {
        try {
            User currentUser = (User) session.getAttribute("currentUser");
            if (currentUser == null) {
                return "redirect:/auth/login";
            }

            if ("admin".equals(currentUser.getRole())) {
                return "redirect:/admin/dashboard_admin";
            }

            model.addAttribute("user", currentUser);
            model.addAttribute("quizzes", quizService.getAvailableQuizzes());
            return "user/dashboard";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An unexpected error occurred: " + e.getMessage());
            return "error/generic_error";
        }
    }
}

