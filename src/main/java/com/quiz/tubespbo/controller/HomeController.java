package com.quiz.tubespbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /* -------------------------------------------------------------------------------------------------- */
    /*                                               INDEX                                                */
    /* -------------------------------------------------------------------------------------------------- */

    // Fungsi untuk return ke halaman index (awal buka aplikasi) - default
    @GetMapping("/")
    public String homePage() {
        try {
            return "index";
        } catch (Exception e) {
            return "error/generic_error";
        }
    }
}
