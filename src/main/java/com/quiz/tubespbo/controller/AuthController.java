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

    /* -------------------------------------------------------------------------------------------------- */
    /*                                              LOGIN                                                 */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

    @PostMapping("/login")
    public String login(String nim, String password, HttpSession session, Model model) {
        try {
            User user = userService.authenticate(nim, password);
            if (user != null) {
                session.setAttribute("currentUser", user);

                if ("admin".equals(user.getRole())) {
                    return "redirect:/admin/dashboard_admin";
                } else {
                    return "redirect:/user/dashboard";
                }
            } else {
                model.addAttribute("error", "Invalid NIM or Password");
                return "auth/login";
            }
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An unexpected error occurred: " + e.getMessage());
            return "error/generic_error"; // Halaman error generik
        }
    }

    /* -------------------------------------------------------------------------------------------------- */
    /*                                           REGISTER                                                 */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/register")
    public String registerPage() {
        return "auth/register";
    }

    @PostMapping("/register")
    public String register(String name, String nim, String password, String role, Model model) {
        try {
            if (userService.existsByNim(nim)) {
                model.addAttribute("error", "NIM sudah ada");
                return "auth/register";
            }

            if ("admin".equals(role)) {
                userService.saveAdmin(name, nim, password);
            } else if ("user".equals(role)) {
                userService.saveRegularUser(name, nim, password);
            } else {
                throw new IllegalArgumentException("Invalid role: " + role);
            }

            return "redirect:/auth/login";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "auth/register";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An unexpected error occurred: " + e.getMessage());
            return "error/generic_error";
        }
    }

    /* -------------------------------------------------------------------------------------------------- */
    /*                                              LOGOUT                                                */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        try {
            session.invalidate();
            return "redirect:/auth/login";
        } catch (Exception e) {
            return "error/generic_error";
        }
    }
}
