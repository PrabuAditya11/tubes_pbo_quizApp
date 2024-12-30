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

    @GetMapping("/dashboard")
    public String userDashboard(HttpSession session, Model model) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
            return "redirect:/auth/login"; // Redirect ke login jika tidak ada session
        }

        if ("admin".equals(currentUser.getRole())) {
            return "redirect:/admin/dashboard_admin"; // Redirect ke dashboard admin jika admin
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
            return "redirect:/auth/login"; // Arahkan ke login jika tidak ada session
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
        }

        model.addAttribute("user", currentUser);  // Menambahkan user ke model
        model.addAttribute("quizzes", quizService.getAvailableQuizzes()); // Menambahkan quiz ke model
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
        return "user/dashboard"; // Redirect ke dashboard user
    }


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
        return "user/dashboard";  // Pastikan halaman dashboard.html ada
    }

>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();  // Menghapus session saat logout
        return "redirect:/auth/login";  // Mengarahkan ke halaman login
    }
}

