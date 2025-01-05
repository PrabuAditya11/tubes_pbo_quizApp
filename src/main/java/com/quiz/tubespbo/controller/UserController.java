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

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    /* -------------------------------------------------------------------------------------------------- */
    /*                                             DASHBOARD                                              */
    /* -------------------------------------------------------------------------------------------------- */

    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke dashboard berdasarkan role yang ada
=======
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    @GetMapping("/dashboard")
    public String userDashboard(HttpSession session, Model model) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) {
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
            return "redirect:/auth/login";
        }

        if ("admin".equals(currentUser.getRole())) {
            return "redirect:/admin/dashboard_admin";
        }

        model.addAttribute("user", currentUser);
        model.addAttribute("quizzes", quizService.getAvailableQuizzes());
        return "user/dashboard";
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

    // Fungsi logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/auth/login";
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
            return "redirect:/auth/login"; // Redirect ke login jika tidak ada session
        }

        if ("admin".equals(currentUser.getRole())) {
            return "redirect:/admin/dashboard_admin"; // Redirect ke dashboard admin jika admin
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
            return "redirect:/auth/login"; // Arahkan ke login jika tidak ada session
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        }

        model.addAttribute("user", currentUser);  // Menambahkan user ke model
        model.addAttribute("quizzes", quizService.getAvailableQuizzes()); // Menambahkan quiz ke model
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
        return "user/dashboard"; // Redirect ke dashboard user
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
        return "user/dashboard";  // Pastikan halaman dashboard.html ada
    }

>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();  // Menghapus session saat logout
        return "redirect:/auth/login";  // Mengarahkan ke halaman login
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    }
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
}

