package com.quiz.tubespbo.controller;

<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.*;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import com.quiz.tubespbo.model.Question;
=======
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.User;
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
import com.quiz.tubespbo.service.QuizResultService;
import com.quiz.tubespbo.service.QuizService;
import com.quiz.tubespbo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114

import java.time.format.DateTimeFormatter;
import java.util.*;

import com.quiz.tubespbo.model.Question;

import java.time.LocalDateTime;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import com.quiz.tubespbo.model.Question;
=======
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
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

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
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
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuizResultService quizResultService;

    @Autowired
    private UserService userService;

<<<<<<< HEAD
    /* -------------------------------------------------------------------------------------------------- */
    /*                                         HALAMAN MANAGE                                             */
    /* -------------------------------------------------------------------------------------------------- */

    // Fungsi untuk menampilkan halaman Manage_Quizzes
    @GetMapping("/manage")
    public String manageQuizzes(HttpSession session, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan halaman Manage_Quizzes
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    // Menampilkan halaman manage quizzes
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @GetMapping("/manage")
    public String manageQuizzes(Model model) {
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        List<Quiz> quizzes = quizService.getAvailableQuizzes();
        model.addAttribute("quizzes", quizzes);
        return "admin/manage_quizzes";
    }

<<<<<<< HEAD






    /* -------------------------------------------------------------------------------------------------- */
    /*                                            CRUD QUIZ                                               */
    /* -------------------------------------------------------------------------------------------------- */

    // CREATE - FORM
    @GetMapping("/new")
    public String createQuizForm(HttpSession session, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        model.addAttribute("quiz", new Quiz());
        return "admin/create_quiz";
    }

    // CREATE
    @PostMapping("/save")
    public String saveQuiz(@ModelAttribute Quiz quiz) {
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk mengarahkan ke Create_Quiz
=======
    // Form untuk membuat quiz baru
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @GetMapping("/new")
    public String createQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz()); // Objek quiz baru untuk binding
        return "admin/create_quiz"; // Path ke template create_quiz.html
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    // Fungsi untuk menyimpan quiz (store)
    @PostMapping("/save")
    public String saveQuiz(@ModelAttribute Quiz quiz) {
        // Check if startTime and endTime are valid
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        if (quiz.getStartTime() != null && quiz.getEndTime() != null && quiz.getEndTime().isBefore(quiz.getStartTime())) {
            throw new IllegalArgumentException("End time cannot be before start time.");
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
    // Fungsi untuk menyimpan quiz (store)
    @PostMapping("/save")
    public String saveQuiz(@ModelAttribute Quiz quiz) {
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        quizService.saveQuiz(quiz);
        return "redirect:/quiz/manage";
    }

<<<<<<< HEAD
    // UPDATE - FORM
    @GetMapping("/{quizId}/edit")
    public String editQuizForm(HttpSession session, @PathVariable Long quizId, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            // Inisialisasi Awal
=======
<<<<<<< HEAD

    // Fungsi untuk menambahkan soal ke quiz
=======
<<<<<<< HEAD

    // Fungsi untuk menambahkan soal ke quiz
=======
<<<<<<< HEAD

    // Fungsi untuk menambahkan soal ke quiz
=======
<<<<<<< HEAD

    // Fungsi untuk menambahkan soal ke quiz
=======
    // Fungsi untuk menambahkan soal ke quiz
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

    // Menyimpan quiz baru
    @PostMapping("/save")
    public String saveQuiz(@ModelAttribute Quiz quiz) {
        quizService.saveQuiz(quiz); // Simpan quiz menggunakan service
        return "redirect:/quiz/manage"; // Redirect ke halaman manage quizzes
    }


    // Form untuk menambahkan soal ke quiz
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @GetMapping("/{quizId}/add-question")
    public String addQuestionForm(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            model.addAttribute("quiz", quiz);
<<<<<<< HEAD
            model.addAttribute("question", new Question());
        }
        return "admin/add_question"; // Nama template untuk form tambah soal
    }

    // Fungsi untuk menyimpan question (store)
=======
            model.addAttribute("question", new Question()); // Objek baru untuk binding
        }
        return "admin/add_question"; // Path ke template add_question.html
    }

<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
<<<<<<< HEAD
    // Fungsi untuk menyimpan question (store)
=======
    // Menyimpan soal baru
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @PostMapping("/{quizId}/save-question")
    public String saveQuestion(@PathVariable Long quizId, @ModelAttribute Question question) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            question.setQuiz(quiz);
<<<<<<< HEAD
            quizService.saveQuestion(question);
        }
        return "redirect:/quiz/" + quizId + "/edit";
    }

=======
            quiz.getQuestions().add(question);
            quizService.saveQuiz(quiz); // Simpan quiz beserta soal baru
        }
        return "redirect:/quiz/manage"; // Redirect ke halaman manage quizzes
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan form edit
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan form edit
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan form edit
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan form edit
=======
<<<<<<< HEAD
    // Fungsi untuk menampilkan form edit
=======
    // Menampilkan halaman edit quiz dan pertanyaannya
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @GetMapping("/{quizId}/edit")
    public String editQuizForm(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
            // Format the startTime and endTime to a format compatible with datetime-local
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            String formattedStartTime = quiz.getStartTime() != null ? quiz.getStartTime().format(formatter) : "";
            String formattedEndTime = quiz.getEndTime() != null ? quiz.getEndTime().format(formatter) : "";

<<<<<<< HEAD
            // Masukkan ke model
=======
            // Pass the formatted times to the model
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
            model.addAttribute("quiz", quiz);
            model.addAttribute("formattedStartTime", formattedStartTime);
            model.addAttribute("formattedEndTime", formattedEndTime);
            model.addAttribute("questions", quiz.getQuestions());
        }
        return "admin/edit_quiz";
    }

<<<<<<< HEAD
    // UPDATE
    @PostMapping("/{quizId}/update-title")
    public String updateQuiz(@PathVariable Long quizId,
                             @RequestParam("title") String title,
                             @RequestParam("startTime") String startTime,
                             @RequestParam("endTime") String endTime) {
        // Convert startTime and endTime from String to LocalDateTime
        LocalDateTime start = LocalDateTime.parse(startTime);
        LocalDateTime end = LocalDateTime.parse(endTime);

        // Retrieve the existing quiz
        Quiz existingQuiz = quizService.getQuizById(quizId);
        if (existingQuiz != null) {
            existingQuiz.setTitle(title);
            existingQuiz.setStartTime(start);
            existingQuiz.setEndTime(end);
            quizService.saveQuiz(existingQuiz); // Save changes
        }

        return "redirect:/quiz/" + quizId + "/edit"; // Redirect to the quiz edit page
    }

    // DELETE
    @PostMapping("/{quizId}/delete")
    public String deleteQuiz(@PathVariable Long quizId) {
        quizService.deleteQuizById(quizId);
        return "redirect:/quiz/manage"; // Kembali ke halaman manage quizzes
    }







    /* -------------------------------------------------------------------------------------------------- */
    /*                                           CRUD QUESTION                                            */
    /* -------------------------------------------------------------------------------------------------- */

    // CREATE - FORM
    @GetMapping("/{quizId}/add-question")
    public String addQuestionForm(HttpSession session, @PathVariable Long quizId, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("question", new Question());
        }
        return "admin/add_question";
    }

    // CREATE
    @PostMapping("/{quizId}/save-question")
    public String saveQuestion(@PathVariable Long quizId, @ModelAttribute Question question) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            question.setQuiz(quiz);
            quizService.saveQuestion(question);
        }
        return "redirect:/quiz/" + quizId + "/edit";
    }

    // UPDATE - FORM
    @GetMapping("/{quizId}/edit-question/{questionId}")
    public String editQuestionForm(HttpSession session, @PathVariable Long quizId, @PathVariable Long questionId, Model model) {
        // Hanya untuk admin
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null || !"admin".equals(currentUser.getRole())) {
            return "redirect:/auth/login";
        }

        Quiz quiz = quizService.getQuizById(quizId);
        Question question = quizService.getQuestionById(questionId);
        if (quiz != null && question != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("question", question);
        }else{
            throw new IllegalArgumentException("Quiz or Question not found");
        }
        return "admin/edit_question"; // Nama template untuk form edit soal
    }

    // UPDATE
=======


    // Fungsi untuk update Question
<<<<<<< HEAD
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
    @PostMapping("/{quizId}/update-question/{questionId}")
    public String updateQuestion(@PathVariable Long quizId, @PathVariable Long questionId,
                                 @ModelAttribute Question updatedQuestion) {
        Question question = quizService.getQuestionById(questionId);
        if (question != null) {
            question.setQuestionText(updatedQuestion.getQuestionText());
            question.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
            question.setDuration(updatedQuestion.getDuration());
            quizService.saveQuestion(question);
        }else{
            throw new IllegalArgumentException("Question not found");
        }
        return "redirect:/quiz/" + quizId + "/edit";
    }

<<<<<<< HEAD
    // DELETE
    @PostMapping("/{quizId}/delete-question/{questionId}")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        quizService.deleteQuestion(questionId);
        return "redirect:/quiz/" + quizId + "/edit";
    }







    /* -------------------------------------------------------------------------------------------------- */
    /*                                           ATTEMPT QUIZ                                             */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        // Cek Session
        User user = (User) session.getAttribute("currentUser");
        if (user == null) {
            return "redirect:/auth/login";
        }

        // Cek apakah Quiz ada
        Quiz quiz = quizService.getQuizById(quizId);
=======
    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        // Retrieve the logged-in user
        User user = (User) session.getAttribute("currentUser");
        if (user == null) {
            return "redirect:/auth/login"; // Redirect to login if no user is logged in
        }

        LocalDateTime now = LocalDateTime.now();
        Quiz quiz = quizService.getQuizById(quizId);

>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found.");
        }

<<<<<<< HEAD
        // Cek apakah Quiz berada diantara akses waktu yang telah ditentukan
        LocalDateTime now = LocalDateTime.now();
=======
        List<Question> shuffledQuestions = quiz.getQuestions();
        Collections.shuffle(shuffledQuestions);

        // Create and save a new QuizResult for the user
        QuizResult quizResult = new QuizResult();
        quizResult.setQuiz(quiz);
        quizResult.setUser(user); // Associate the user with the result
        quizResult.setStartTime(now);
        quizResultService.saveQuizResult(quizResult);

        // Store quiz details in session
        session.setAttribute("shuffledQuestions", shuffledQuestions);
        session.setAttribute("quizStartTime", now);
        session.setAttribute("currentQuestionIndex", 0);
        session.setAttribute("totalScore", 0);
        session.setAttribute("quizResult", quizResult);

        model.addAttribute("quiz", quiz);
        model.addAttribute("shuffledQuestions", shuffledQuestions);
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
            model.addAttribute("quiz", quiz);
            model.addAttribute("questions", quiz.getQuestions());
        }
        return "admin/edit_quiz"; // Path ke template edit_quiz.html
    }

<<<<<<< HEAD
    // Fungsi untuk update Question
=======
<<<<<<< HEAD
    // Fungsi untuk update Question
=======
<<<<<<< HEAD
    // Fungsi untuk update Question
=======
<<<<<<< HEAD
    // Fungsi untuk update Question
=======
<<<<<<< HEAD
    // Fungsi untuk update Question
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    @PostMapping("/{quizId}/update-question/{questionId}")
    public String updateQuestion(@PathVariable Long quizId,
                                 @PathVariable Long questionId,
                                 @RequestParam String questionText,
                                 @RequestParam String correctAnswer) {
        Question question = quizService.getQuestionById(questionId);

        if (question == null) {
            throw new IllegalArgumentException("Question not found");
        }

        // Update data soal
        question.setQuestionText(questionText);
        question.setCorrectAnswer(Boolean.parseBoolean(correctAnswer));

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
        quizService.saveQuestion(question);

        return "redirect:/quiz/" + quizId + "/edit";
    }

    // Fungsi untuk menampilkan seluruh halaman quiz untuk user
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        // Get current time
        LocalDateTime now = LocalDateTime.now();

        // Fetch the quiz from the database
        Quiz quiz = quizService.getQuizById(quizId);

        // Check if quiz start time and end time are valid
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

        // Check if the quiz is within the allowed time range
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        if (quiz.getStartTime() != null && now.isBefore(quiz.getStartTime())) {
            model.addAttribute("error", "This quiz has not started yet.");
            return "quiz/error";
        }

        if (quiz.getEndTime() != null && now.isAfter(quiz.getEndTime())) {
            model.addAttribute("error", "This quiz has already ended.");
            return "quiz/error";
        }

<<<<<<< HEAD
        List<Question> shuffledQuestions = quiz.getQuestions();
        Collections.shuffle(shuffledQuestions);

        // Set QuizResult
        QuizResult quizResult = new QuizResult();
        quizResult.setQuiz(quiz);
        quizResult.setUser(user);
        quizResult.setStartTime(now);
        quizResultService.saveQuizResult(quizResult);

        // Masukkan data ke session
        session.setAttribute("shuffledQuestions", shuffledQuestions);
        session.setAttribute("quizStartTime", now);
        session.setAttribute("currentQuestionIndex", 0);
        session.setAttribute("totalScore", 0);
        session.setAttribute("quizResult", quizResult);

        model.addAttribute("quiz", quiz);
        model.addAttribute("shuffledQuestions", shuffledQuestions);
=======
<<<<<<< HEAD
        // Store the start time in the session
        session.setAttribute("quizStartTime", now);

        // Proceed to the quiz
        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);
        return "quiz/quiz";  // Proceed to the quiz page
=======
        // Proceed to the quiz
        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);
        return "quiz/quiz";
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
=======
        // Simpan perubahan
        quizService.saveQuestion(question);

        return "redirect:/quiz/" + quizId + "/edit"; // Kembali ke halaman daftar soal
    }

<<<<<<< HEAD
=======
=======
    // Menyimpan perubahan quiz dan pertanyaannya
    @PostMapping("/{quizId}/update")
    public String updateQuiz(@PathVariable Long quizId,
                             @ModelAttribute Quiz quiz,
                             @RequestParam Map<String, String> updatedQuestions) {
        Quiz existingQuiz = quizService.getQuizById(quizId);
        if (existingQuiz != null) {
            existingQuiz.setTitle(quiz.getTitle());

            // Update pertanyaan yang ada
            List<Question> questions = existingQuiz.getQuestions();
            for (Question question : questions) {
                String updatedText = updatedQuestions.get("questionText[" + question.getId() + "]");
                Boolean updatedAnswer = Boolean.parseBoolean(updatedQuestions.get("correctAnswer[" + question.getId() + "]"));
                question.setQuestionText(updatedText);
                question.setCorrectAnswer(updatedAnswer);
            }

            // Simpan quiz dengan perubahan
            quizService.saveQuiz(existingQuiz);
        }
        return "redirect:/quiz/manage"; // Kembali ke halaman manage quiz
    }

    // Menghapus question dari quiz
    @PostMapping("/{quizId}/question/{questionId}/delete")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            quiz.getQuestions().removeIf(q -> q.getId().equals(questionId));
            quizService.saveQuiz(quiz);
        }
        return "redirect:/quiz/" + quizId + "/edit"; // Kembali ke halaman edit quiz
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    }



<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb

    // Fungsi untuk submit quiz
    @PostMapping("/{id}/submit")
    public String submitQuiz(@PathVariable("id") Long quizId,
                             @RequestParam Map<String, String> answers,
                             HttpSession session,
                             Model model) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    // Menampilkan halaman quiz untuk user
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
    @GetMapping("/{id}/attempt")
    public String attemptQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        LocalDateTime startTime = LocalDateTime.now();
        session.setAttribute("quizStartTime", startTime);
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
<<<<<<< HEAD

=======
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
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
        if (quizId == null) {
            throw new IllegalArgumentException("Quiz ID cannot be null");
        }

>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) {
            return "redirect:/auth/login";
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
        Quiz quiz = quizService.getQuizById(quizId);
        QuizResult existingResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);

        // Jika hasil tidak ada, buat hasil baru
        if (existingResult == null) {
            existingResult = new QuizResult();
            existingResult.setUser(currentUser);
            existingResult.setQuiz(quiz);
            existingResult.setStartTime(startTime);
            existingResult.setEndTime(null);
            existingResult.setScore(0);
            quizResultService.saveQuizResult(existingResult);
        }

        // Remove shuffling and leave questions in their original order
        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);

>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        return "quiz/quiz";
    }


<<<<<<< HEAD
    /* -------------------------------------------------------------------------------------------------- */
    /*                                        SUBMIT QUESTION                                             */
    /* -------------------------------------------------------------------------------------------------- */

=======
<<<<<<< HEAD
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
    @PostMapping("/submit-question")
    @ResponseBody
    public Map<String, Object> submitQuestion(
            @RequestParam("questionIndex") int questionIndex,
            @RequestParam("userAnswer") boolean userAnswer,
            @RequestParam("timeLeft") int timeLeft,
            HttpSession session) {

<<<<<<< HEAD
        // Ambil soal acak yang disimpan dalam sesi
        List<Question> shuffledQuestions = (List<Question>) session.getAttribute("shuffledQuestions");
        Question question = shuffledQuestions.get(questionIndex);

        // Ambil hasil quiz
        QuizResult quizResult = (QuizResult) session.getAttribute("quizResult");
        int totalScore = (int) session.getAttribute("totalScore");

        // Cek jawaban user
        boolean isCorrect = userAnswer == question.getCorrectAnswer();

        // Hitung skor soal
        int questionScore = isCorrect ? (int) ((timeLeft / (double) question.getDuration()) * 1000) : 0;
        totalScore += questionScore;

        // Update skor total di sesi
        session.setAttribute("totalScore", totalScore);

        // Simpan jawaban user ke database
=======
        List<Question> shuffledQuestions = (List<Question>) session.getAttribute("shuffledQuestions");
        Question question = shuffledQuestions.get(questionIndex);

        QuizResult quizResult = (QuizResult) session.getAttribute("quizResult");
        Quiz quiz = quizResult.getQuiz();
        int totalScore = (int) session.getAttribute("totalScore");

//        Question question = quiz.getQuestions().get(questionIndex);
        boolean isCorrect = userAnswer == question.getCorrectAnswer();

        // Calculate the score
        int questionScore = isCorrect ? (int) ((timeLeft / (double) question.getDuration()) * 1000) : 0;
        totalScore += questionScore;
        session.setAttribute("totalScore", totalScore);

        // Save UserAnswer
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        UserAnswer userAnswerEntity = new UserAnswer(
                quizResult, question, userAnswer, (long) (question.getDuration() - timeLeft), questionScore
        );
        quizResultService.saveUserAnswer(userAnswerEntity);

<<<<<<< HEAD
        // Jika ini soal terakhir, perbarui waktu selesai dan hasil akhir
        boolean isLastQuestion = questionIndex == shuffledQuestions.size() - 1;
        if (isLastQuestion) {
            quizResult.setEndTime(LocalDateTime.now());
            quizResult.setScore(totalScore);
            long timeTaken = java.time.Duration.between(quizResult.getStartTime(), LocalDateTime.now()).toSeconds();
            quizResult.setTimeTakenInSeconds(timeTaken);
            quizResultService.saveQuizResult(quizResult);
        }

        // Siapkan respons untuk frontend
=======
        // Prepare response
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        Map<String, Object> response = new HashMap<>();
        response.put("isCorrect", isCorrect);
        response.put("correctAnswer", question.getCorrectAnswer() ? "True" : "False");
        response.put("questionScore", questionScore);
        response.put("totalScore", totalScore);
<<<<<<< HEAD
        response.put("isLastQuestion", isLastQuestion);
=======
        response.put("isLastQuestion", questionIndex == shuffledQuestions.size() - 1);
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114

        return response;
    }


<<<<<<< HEAD






    /* -------------------------------------------------------------------------------------------------- */
    /*                                           SUBMIT QUIZ                                              */
    /* -------------------------------------------------------------------------------------------------- */

=======
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
    @PostMapping("/{id}/submit")
    public String submitQuiz(@PathVariable("id") Long quizId, HttpSession session, Model model) {
        LocalDateTime now = LocalDateTime.now();

        QuizResult quizResult = (QuizResult) session.getAttribute("quizResult");
        int totalScore = (int) session.getAttribute("totalScore");

        quizResult.setEndTime(now);
        quizResult.setScore(totalScore);
        quizResult.setTimeTakenInSeconds(
                java.time.Duration.between(quizResult.getStartTime(), now).toSeconds()
        );
        quizResultService.saveQuizResult(quizResult);

        model.addAttribute("quizId", quizId); // Kirim quizId ke template
        model.addAttribute("score", totalScore);
        model.addAttribute("timeTaken", quizResult.getTimeTakenInSeconds());

        return "/quiz/result";
    }

<<<<<<< HEAD
    /* -------------------------------------------------------------------------------------------------- */
    /*                                           LEADERBOARD                                              */
    /* -------------------------------------------------------------------------------------------------- */

    @GetMapping("/{quizId}/leaderboard")
    public String getLeaderboard(HttpSession session, @PathVariable Long quizId, Model model) {
        // Cek Session
        User currentUser = (User) session.getAttribute("currentUser");

        Quiz quiz = quizService.getQuizById(quizId);

=======

//     Fungsi untuk review hasil
=======

    // Fungsi untuk submit quiz
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
        Quiz quiz = quizService.getQuizById(quizId);

=======
<<<<<<< HEAD
        Quiz quiz = quizService.getQuizById(quizId);

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
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        // Fetch the quiz by ID
        Quiz quiz = quizService.getQuizById(quizId);

        // Shuffle the questions to randomize their order
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
        Collections.shuffle(quiz.getQuestions());

        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
        return "quiz/quiz";
    }

    // Fungsi untuk submit quiz
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
=======
<<<<<<< HEAD
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        return "quiz/quiz";
    }

>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
    @PostMapping("/{id}/submit")
    public String submitQuiz(@PathVariable("id") Long quizId,
                             @RequestParam Map<String, String> answers,
                             HttpSession session,
                             Model model) {
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
        Quiz quiz = quizService.getQuizById(quizId);
        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
        return "quiz/quiz";
    }

    // Memproses jawaban setelah user submit
    @PostMapping("/{id}/submit")
    public String submitQuiz(@PathVariable("id") Long quizId,
                             @RequestParam Map<String, String> answers, // Menggunakan Map untuk menangkap jawaban
                             HttpSession session,
                             Model model) {
        // Mendapatkan data user dari session
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
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
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) {
            return "redirect:/auth/login";
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
        // Mendapatkan quiz berdasarkan ID
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
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
        Quiz quiz = quizService.getQuizById(quizId);
        int score = 0;
        long timeTakenInSeconds = 0;

<<<<<<< HEAD
        // Retrieve the start time from the session
        LocalDateTime startTime = (LocalDateTime) session.getAttribute("quizStartTime");
        if (startTime != null) {
            // Calculate the time taken in seconds
            timeTakenInSeconds = java.time.Duration.between(startTime, LocalDateTime.now()).getSeconds();
        }

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
<<<<<<< HEAD
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
        List<Boolean> userAnswers = new ArrayList<>();
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            String answer = answers.get("answers[" + i + "]");
            Boolean correctAnswer = quiz.getQuestions().get(i).getCorrectAnswer();
<<<<<<< HEAD
            userAnswers.add(Boolean.parseBoolean(answer));
=======
<<<<<<< HEAD
            userAnswers.add(Boolean.parseBoolean(answer));
=======
            userAnswers.add(Boolean.parseBoolean(answer)); // Simpan jawaban user
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd

            if (Boolean.parseBoolean(answer) == correctAnswer) {
                score += 10;
            }
        }

        score *= 2;
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
        // Hitung skor berdasarkan jawaban yang benar
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            String answer = answers.get("answers[" + i + "]"); // Mendapatkan jawaban berdasarkan indeks
            Boolean correctAnswer = quiz.getQuestions().get(i).getCorrectAnswer();
            if (Boolean.parseBoolean(answer) == correctAnswer) {
                score += 10;  // Misalnya, setiap jawaban benar diberi 10 poin
            }
        }

<<<<<<< HEAD
        // Skor * 2 karena soalnya 5
        score *= 2;
=======
<<<<<<< HEAD
        // Skor * 2 karena soalnya 5
        score *= 2;
=======
<<<<<<< HEAD
        // Skor * 2 karena soalnya 5
        score *= 2;
=======
<<<<<<< HEAD
        // Skor * 2 karena soalnya 5
        score *= 2;
=======
<<<<<<< HEAD
        // Skor * 2 karena soalnya 5
        score *= 2;
=======
        // Skor maksimum 100
        score *= 2;
        if (score > 100) {
            score = 100;
        }
>>>>>>> fa9f676b6cc3ccb5aa73ed0439f243242d145295
>>>>>>> 9f247781e79bfa142dca17f44dc17ca11ed6064e
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1

        // Mendapatkan waktu mulai dan menghitung waktu yang dibutuhkan
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
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
        LocalDateTime startTime = (LocalDateTime) session.getAttribute("quizStartTime");
        if (startTime != null) {
            timeTakenInSeconds = java.time.Duration.between(startTime, LocalDateTime.now()).getSeconds();
        }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
        // Calculate the base score per question
        double baseScorePerQuestion = 100.0 / quiz.getQuestions().size();

        // Calculate bonus based on the time taken
        double bonus = 0.0;
        if (timeTakenInSeconds <= 180) {
            bonus = 0.10 * 100; // Bonus 10 %
        } else if (timeTakenInSeconds <= 240) {
            bonus = 0.05 * 100; // Bonus 5%
        }

<<<<<<< HEAD
        // Check if the QuizResult already exists for the current user
        QuizResult quizResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);
        if (quizResult == null) {
            // If not found, create a new result
=======
        // Cek apakah QuizResult sudah ada
        QuizResult quizResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);
        if (quizResult == null) {
            // If not found, create a new result
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
        // Cek apakah QuizResult sudah ada
        QuizResult quizResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);
        if (quizResult == null) {
            // Jika belum ada, buat QuizResult baru
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
            quizResult = new QuizResult();
            quizResult.setUser(currentUser);
            quizResult.setQuiz(quiz);
            quizResult.setStartTime(startTime);
            quizResult.setEndTime(LocalDateTime.now());
            quizResult.setTimeTakenInSeconds(timeTakenInSeconds);
            quizResult.setScore(0); // Temporary score
            quizResultService.saveQuizResult(quizResult);
        }

        // Save answers based on their original order
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            Question question = quiz.getQuestions().get(i);
            String answer = answers.get("answers[" + i + "]");
            Boolean userAnswer = (answer != null) ? Boolean.parseBoolean(answer) : null;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
            quizResultService.updateOrSaveUserAnswer(quizResult, question, userAnswer);

            if (userAnswer != null && userAnswer.equals(question.getCorrectAnswer())) {
                score += baseScorePerQuestion;
            }
        }

        score += bonus;

<<<<<<< HEAD
        // Set max 100
=======
        // Set maks 100
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
        quizResult.setScore(Math.min((int) score, 100));
        quizResultService.saveQuizResult(quizResult);

        // Add attributes to the model for the result page
        model.addAttribute("quizId", quizId);
        model.addAttribute("userId", currentUser.getId());
        model.addAttribute("score", Math.min((int) score, 100)); // Ensure the max score is 100
        model.addAttribute("timeTakenInSeconds", timeTakenInSeconds);
        model.addAttribute("bonus", bonus);

        return "quiz/result";
    }



<<<<<<< HEAD

    // Fungsi untuk menampilkan leaderboard pada quiz tertentu
=======
    // Fungsi untuk menampilkan leaderboard pada quiz tertentu
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
            // Save or update the user answer for this question
            quizResultService.updateOrSaveUserAnswer(quizResult, question, userAnswer);

            // Hitung skor
            if (userAnswer != null && userAnswer.equals(question.getCorrectAnswer())) {
                score += 10;
            }
        }

        // Update skor di QuizResult
        quizResult.setScore(score);
        quizResultService.saveQuizResult(quizResult);

        // Tambahkan atribut ke model untuk halaman hasil
        model.addAttribute("quizId", quizId);
        model.addAttribute("userId", currentUser.getId());
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
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
        // Bonus score dari timeTaken
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
        if (timeTakenInSeconds <= 10) {
            score += 90;
        } else if (timeTakenInSeconds <= 30) {
            score += 50;
        } else if (timeTakenInSeconds <= 50) {
            score += 10;
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
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
        QuizResult existingResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);
        if (existingResult != null) {
            quizResultService.updateQuizResult(existingResult, score, startTime, LocalDateTime.now(), timeTakenInSeconds, userAnswers);
        } else {
            quizResultService.saveQuizResult(currentUser, quiz, score, startTime, LocalDateTime.now(), timeTakenInSeconds, userAnswers);
        }

<<<<<<< HEAD
        // Tambahkan quizId dan userId
        model.addAttribute("quizId", quizId);
        model.addAttribute("userId", currentUser.getId());
=======
<<<<<<< HEAD
        // Tambahkan quizId dan userId
        model.addAttribute("quizId", quizId);
        model.addAttribute("userId", currentUser.getId());
=======
        // Tambahkan quizId dan userId ke model
        model.addAttribute("quizId", quizId);
        model.addAttribute("userId", currentUser.getId());
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
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
        // Cek apakah hasil quiz sudah ada berdasarkan userId dan quizId
        QuizResult existingResult = quizResultService.getQuizResultByUserAndQuiz(quizId, currentUser.getId());

        if (existingResult != null && existingResult.getUser().getId().equals(currentUser.getId())) {
            // Jika hasil sudah ada dan sesuai userId, lakukan update
<<<<<<< HEAD
=======
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9f247781e79bfa142dca17f44dc17ca11ed6064e
        //bonus score dari timeTaken
        if(timeTakenInSeconds<=10){
            score += 90;
        } else if(timeTakenInSeconds<=30){
            score += 50;
        } else if(timeTakenInSeconds<=50){
            score += 10;
        }

<<<<<<< HEAD
=======
=======
>>>>>>> fa9f676b6cc3ccb5aa73ed0439f243242d145295
>>>>>>> 9f247781e79bfa142dca17f44dc17ca11ed6064e
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
        // Cek apakah hasil quiz sudah ada berdasarkan userId dan quizId
        QuizResult existingResult = quizResultService.getQuizResultByUserAndQuiz(quizId, currentUser.getId());

        if (existingResult != null) {
            // Jika hasil sudah ada, lakukan update
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
            quizResultService.updateQuizResult(existingResult, score, startTime, LocalDateTime.now(), timeTakenInSeconds);
        } else {
            // Jika tidak ada hasil sebelumnya, simpan sebagai hasil baru
            quizResultService.saveQuizResult(currentUser, quiz, score, startTime, LocalDateTime.now(), timeTakenInSeconds);
        }

>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
        model.addAttribute("score", score);
        model.addAttribute("timeTakenInSeconds", timeTakenInSeconds);

        return "quiz/result";
    }
<<<<<<< HEAD

    // Fungsi untuk menampilkan leaderboard pada quiz tertentu
=======
<<<<<<< HEAD

    // Fungsi untuk menampilkan leaderboard pada quiz tertentu
=======
<<<<<<< HEAD

    // Fungsi untuk menampilkan leaderboard pada quiz tertentu
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
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8

    // Menampilkan leaderboard untuk quiz tertentu
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    @GetMapping("/{id}/leaderboard")
    public String getLeaderboard(@PathVariable("id") Long quizId, Model model) {
        // Validasi apakah quiz ada
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
<<<<<<< HEAD
        // Ambil hasil leaderboard
=======
        // Ambil hasil leaderboard berdasarkan quiz ID
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
        List<QuizResult> leaderboard = quizResultService.getLeaderboardByQuiz(quizId);

        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

        return "quiz/leaderboard"; // Menampilkan halaman leaderboard
    }

<<<<<<< HEAD
    // Fungsi untuk review hasil
=======
<<<<<<< HEAD
    // Fungsi untuk review hasil
=======
<<<<<<< HEAD
    // Fungsi untuk review hasil
=======
<<<<<<< HEAD
    // Fungsi untuk review hasil
=======
<<<<<<< HEAD
    // Fungsi untuk review hasil
=======
<<<<<<< HEAD
    // Fungsi untuk review hasil
=======
<<<<<<< HEAD
    // Fungsi untuk review hasil
=======
<<<<<<< HEAD
    // Fungsi untuk review hasil
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
    @GetMapping("/{quizId}/review/{userId}")
    public String reviewQuiz(@PathVariable Long quizId, @PathVariable Long userId, Model model) {
        // Ambil quiz berdasarkan ID
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

        // Ambil hasil quiz berdasarkan userId dan quizId
        QuizResult quizResult = quizResultService.getQuizResultByUserAndQuiz(userId, quizId);
        if (quizResult == null) {
            throw new IllegalArgumentException("Quiz result not found for user and quiz.");
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
        // Ambil semua jawaban user untuk quiz result ini
        List<UserAnswer> userAnswers = quizResultService.getUserAnswersByQuizResult(quizResult.getId());
        quizResult.setUserAnswers(userAnswers);

        // Ambil semua question dari quiz
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
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
        // Debug, hadehhh
        System.out.println("Answers: " + quizResult.getAnswers());

        // Ambil semua question dari quiz
<<<<<<< HEAD
=======
=======
        // Debugging: periksa nilai "answers"
        System.out.println("Answers: " + quizResult.getAnswers());

        // Ambil semua pertanyaan dari quiz
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
        List<Question> questions = quiz.getQuestions();

        model.addAttribute("quiz", quiz);
        model.addAttribute("questions", questions);
        model.addAttribute("quizResult", quizResult);

        return "quiz/review"; // Halaman review
    }

<<<<<<< HEAD


=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3

    // Fungsi untuk update title quiz
    @PostMapping("/{quizId}/update-title")
    public String updateQuiz(@PathVariable Long quizId,
                             @RequestParam("title") String title,
                             @RequestParam("startTime") String startTime,
                             @RequestParam("endTime") String endTime) {
        // Convert startTime and endTime from String to LocalDateTime
        LocalDateTime start = LocalDateTime.parse(startTime);
        LocalDateTime end = LocalDateTime.parse(endTime);

        // Retrieve the existing quiz
        Quiz existingQuiz = quizService.getQuizById(quizId);
        if (existingQuiz != null) {
            existingQuiz.setTitle(title);
            existingQuiz.setStartTime(start);
            existingQuiz.setEndTime(end);
            quizService.saveQuiz(existingQuiz); // Save changes
        }

        return "redirect:/quiz/" + quizId + "/edit"; // Redirect to the quiz edit page
    }


    // Fungsi untuk tambah question berdasarkan quizid
<<<<<<< HEAD
    @GetMapping("/{quizId}/edit-question/{questionId}")
    public String editQuestionForm(@PathVariable Long quizId, @PathVariable Long questionId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        Question question = quizService.getQuestionById(questionId);
        if (quiz != null && question != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("question", question);
        }else{
            throw new IllegalArgumentException("Quiz or Question not found");
        }
        return "admin/edit_question"; // Nama template untuk form edit soal
    }

    // Fungsi untuk delete Question
    @PostMapping("/{quizId}/delete-question/{questionId}")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        quizService.deleteQuestion(questionId);
        return "redirect:/quiz/" + quizId + "/edit";
    }

    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD

    // Fungsi untuk update title quiz
=======
<<<<<<< HEAD

    // Fungsi untuk update title quiz
=======
<<<<<<< HEAD

    // Fungsi untuk update title quiz
=======
<<<<<<< HEAD
    // Fungsi untuk update title quiz
=======
<<<<<<< HEAD
    // Fungsi untuk update title quiz
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
    @PostMapping("/{quizId}/update-title")
    public String updateQuizTitle(@PathVariable Long quizId,
                                  @RequestParam("title") String title) {
        // Ambil quiz dari database
        Quiz existingQuiz = quizService.getQuizById(quizId);
        if (existingQuiz != null) {
            existingQuiz.setTitle(title);
            quizService.saveQuiz(existingQuiz); // Simpan perubahan
        }
        return "redirect:/quiz/" + quizId + "/edit"; // Kembali ke halaman edit
    }

<<<<<<< HEAD
    // Fungsi untuk tambah question berdasarkan quizid
=======
<<<<<<< HEAD
    // Fungsi untuk tambah question berdasarkan quizid
=======
<<<<<<< HEAD
    // Fungsi untuk tambah question berdasarkan quizid
=======
<<<<<<< HEAD
    // Fungsi untuk tambah question berdasarkan quizid
=======
<<<<<<< HEAD
    // Fungsi untuk tambah question berdasarkan quizid
=======
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    @GetMapping("/{quizId}/edit-question/{questionId}")
    public String editQuestionForm(@PathVariable Long quizId,
                                   @PathVariable Long questionId,
                                   Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        Question question = quizService.getQuestionById(questionId);

        if (quiz == null || question == null) {
            throw new IllegalArgumentException("Quiz or Question not found");
        }

        model.addAttribute("quiz", quiz);
        model.addAttribute("question", question);

        return "admin/edit_question"; // Path ke template yang benar
    }


<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
<<<<<<< HEAD
    // Fungsi untuk delete Question
=======
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    @PostMapping("/{quizId}/question/{questionId}/delete")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        quizService.deleteQuestion(questionId);
        return "redirect:/quiz/" + quizId + "/edit"; // Kembali ke halaman edit quiz
    }

<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
    // Fungsi untuk delete Quiz
=======
<<<<<<< HEAD
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @PostMapping("/{quizId}/delete")
    public String deleteQuiz(@PathVariable Long quizId) {
        quizService.deleteQuizById(quizId);
        return "redirect:/quiz/manage"; // Kembali ke halaman manage quizzes
    }
<<<<<<< HEAD

    // Method to display leaderboard
    @GetMapping("/{quizId}/leaderboard")
    public String getLeaderboard(@PathVariable Long quizId, Model model) {
        if (quizId == null) {
            throw new IllegalArgumentException("Quiz ID cannot be null.");
        }

        Quiz quiz = quizService.getQuizById(quizId);
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found.");
        }

        List<QuizResult> leaderboard = quizResultService.getLeaderboardForQuiz(quizId);
        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

<<<<<<< HEAD
        if (currentUser == null || "admin".equals(currentUser.getRole())) {
            return "admin/leaderboard";
        } else {
            return "quiz/leaderboard";
        }

    }

    @PostMapping("/{quizId}/clear-participants")
    public String clearParticipants(@PathVariable Long quizId) {
        quizResultService.clearParticipantsByQuizId(quizId);
        return "redirect:/quiz/" + quizId + "/admin-leaderboard"; // Redirect ke halaman edit quiz setelah clear
    }

}
=======
        return "quiz/leaderboard";
    }

    @GetMapping("/{quizId}/admin-leaderboard")
    public String viewAdminLeaderboard(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found.");
        }

        List<QuizResult> leaderboard = quizResultService.getLeaderboardForQuiz(quizId);
        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

        return "admin/leaderboard";
    }

}
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
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb




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
=======
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
}
=======
<<<<<<< HEAD

}
=======
<<<<<<< HEAD
}
=======


}
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
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
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
