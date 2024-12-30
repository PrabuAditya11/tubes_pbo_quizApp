package com.quiz.tubespbo.controller;

<<<<<<< HEAD
import jakarta.servlet.http.HttpSession;
import com.quiz.tubespbo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
=======
import org.springframework.stereotype.Controller;
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index"; // Mengarah ke templates/index.html
    }
<<<<<<< HEAD

    @GetMapping("/admin/dashboard")
    public String adminDashboard(HttpSession session, Model model) {
        // Pastikan user yang mengakses adalah admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login"; // Redirect ke login jika bukan admin
        }

        model.addAttribute("user", currentUser);
        return "admin/dashboard_admin"; // Halaman dashboard admin
    }
=======
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
}
