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

<<<<<<< HEAD
    // Fungsi untuk return ke halaman login page
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    // Menampilkan halaman login
    @GetMapping("/login")
    public String loginPage() {
        return "auth/login"; // Mengarah ke templates/auth/login.html
    }

    // Proses login
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
    @PostMapping("/login")
    public String login(String nim, String password, HttpSession session, Model model) {
        User user = userService.authenticate(nim, password);
        if (user != null) {
            session.setAttribute("currentUser", user);
<<<<<<< HEAD

            // Role
            if ("admin".equals(user.getRole())) {
                return "admin/dashboard_admin";
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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8

            // Redirect berdasarkan role
            if ("admin".equals(user.getRole())) {
                return "admin/dashboard_admin"; // Admin dashboard
            } else {
                return "redirect:/user/dashboard"; // User dashboard
            }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
            return "redirect:/user/dashboard"; // Redirect ke dashboard user
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        } else {
            model.addAttribute("error", "Invalid NIM or Password");
            return "auth/login"; // Kembali ke halaman login dengan pesan error
        }
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8


    @GetMapping("/register")
    public String registerPage() {
        return "auth/register"; // Mengarah ke templates/auth/register.html
    }

    @PostMapping("/register")
    public String register(String name, String nim, String password, String role, Model model) {
        if (userService.existsByNim(nim)) {
            model.addAttribute("error", "NIM already exists");
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
            return "auth/register";
        }

        User user = new User();
        user.setName(name);
        user.setNim(nim);
        user.setPassword(password);
        user.setRole(role);
        userService.saveUser(user);

<<<<<<< HEAD
        return "redirect:/auth/login";
    }

    // Fungsi logout dan destroy session
=======
        return "redirect:/auth/login"; // Redirect ke halaman login
    }

>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/auth/login";
    }
}


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    // Proses logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/auth/login"; // Redirect ke halaman login
    }
}

>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
