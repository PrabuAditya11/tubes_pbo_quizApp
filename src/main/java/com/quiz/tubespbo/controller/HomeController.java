package com.quiz.tubespbo.controller;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
import jakarta.servlet.http.HttpSession;
import com.quiz.tubespbo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
=======
=======
import org.springframework.stereotype.Controller;
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

<<<<<<< HEAD
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
=======
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
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
}
