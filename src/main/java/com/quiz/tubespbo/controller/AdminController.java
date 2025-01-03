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

<<<<<<< HEAD
    /* -------------------------------------------------------------------------------------------------- */
    /*                                        ADMIN DASHBOARD                                             */
    /* -------------------------------------------------------------------------------------------------- */

=======
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
    @GetMapping("/dashboard_admin")
    public String adminDashboard(HttpSession session, Model model) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }
        model.addAttribute("admin", currentUser);
        return "admin/dashboard_admin";
    }
<<<<<<< HEAD
=======

    // Tambahkan fungsi logout khusus untuk admin
    @GetMapping("/logout")
    public String adminLogout(HttpSession session) {
        session.invalidate(); // Hapus sesi saat admin logout
        return "redirect:/auth/login";
    }
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
}

