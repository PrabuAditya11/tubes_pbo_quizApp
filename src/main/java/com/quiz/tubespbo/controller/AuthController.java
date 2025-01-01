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
    // Fungsi untuk return ke halaman login page
=======
<<<<<<< HEAD
    // Fungsi untuk return ke halaman login page
=======
<<<<<<< HEAD
    // Fungsi untuk return ke halaman login page
=======
<<<<<<< HEAD
    // Fungsi untuk return ke halaman login page
=======
<<<<<<< HEAD
    // Fungsi untuk return ke halaman login page
=======
<<<<<<< HEAD
    // Fungsi untuk return ke halaman login page
=======
<<<<<<< HEAD
    // Fungsi untuk return ke halaman login page
=======
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
    // Fungsi Login
=======
<<<<<<< HEAD
    // Fungsi Login
=======
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @PostMapping("/login")
    public String login(String nim, String password, HttpSession session, Model model) {
        User user = userService.authenticate(nim, password);
        if (user != null) {
            session.setAttribute("currentUser", user);
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3

            // Role
            if ("admin".equals(user.getRole())) {
                return "redirect:/admin/dashboard_admin";
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD

            // Role
            if ("admin".equals(user.getRole())) {
                return "admin/dashboard_admin";
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
            return "auth/register";
        }

        User user = new User();
        user.setName(name);
        user.setNim(nim);
        user.setPassword(password);
        user.setRole(role);
        userService.saveUser(user);

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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
        return "redirect:/auth/login";
    }

    // Fungsi logout dan destroy session
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
        return "redirect:/auth/login"; // Redirect ke halaman login
    }

>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
