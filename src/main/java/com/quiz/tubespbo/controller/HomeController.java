package com.quiz.tubespbo.controller;

import jakarta.servlet.http.HttpSession;
import com.quiz.tubespbo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Fungsi untuk return ke halaman index (awal buka aplikasi)
    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    // Fungsi untuk mengarah ke halaman dashboard ADMIN
    @GetMapping("/admin/dashboard")
    public String adminDashboard(HttpSession session, Model model) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        model.addAttribute("user", currentUser);
        return "admin/dashboard_admin";
    }
}
