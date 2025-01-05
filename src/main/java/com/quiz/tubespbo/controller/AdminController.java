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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
    /* -------------------------------------------------------------------------------------------------- */
    /*                                        ADMIN DASHBOARD                                             */
    /* -------------------------------------------------------------------------------------------------- */

<<<<<<< HEAD
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
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
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
<<<<<<< HEAD
=======

    // Tambahkan fungsi logout khusus untuk admin
    @GetMapping("/logout")
    public String adminLogout(HttpSession session) {
        session.invalidate(); // Hapus sesi saat admin logout
        return "redirect:/auth/login";
    }
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
}

>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
