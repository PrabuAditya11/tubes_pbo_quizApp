package com.quiz.tubespbo.controller;

import com.quiz.tubespbo.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private HttpSession httpSession;

    /* -------------------------------------------------------------------------------------------------- */
    /*                                        ADMIN DASHBOARD                                             */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/dashboard_admin")
    public String adminDashboard(HttpSession session, Model model) {
        try {
            User currentUser = (User) session.getAttribute("currentUser");
            if (currentUser == null || !"admin".equals(currentUser.getRole())) {
                return "redirect:/auth/login";
            }
            model.addAttribute("admin", currentUser);
            return "admin/dashboard_admin";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An unexpected error occurred: " + e.getMessage());
            return "error/generic_error";
        }
    }
}
