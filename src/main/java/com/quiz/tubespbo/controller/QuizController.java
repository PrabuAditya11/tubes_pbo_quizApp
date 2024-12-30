package com.quiz.tubespbo.controller;

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
import com.quiz.tubespbo.model.Quiz;
import com.quiz.tubespbo.model.QuizResult;
import com.quiz.tubespbo.model.User;
import com.quiz.tubespbo.service.QuizResultService;
import com.quiz.tubespbo.service.QuizService;
import com.quiz.tubespbo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8

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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    // Menampilkan halaman manage quizzes
    @GetMapping("/manage")
    public String manageQuizzes(Model model) {
        List<Quiz> quizzes = quizService.getAvailableQuizzes();
        model.addAttribute("quizzes", quizzes);
        return "admin/manage_quizzes";
    }

    // Form untuk membuat quiz baru
    @GetMapping("/new")
    public String createQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz()); // Objek quiz baru untuk binding
        return "admin/create_quiz"; // Path ke template create_quiz.html
    }


    // Menyimpan quiz baru
    @PostMapping("/save")
    public String saveQuiz(@ModelAttribute Quiz quiz) {
        quizService.saveQuiz(quiz); // Simpan quiz menggunakan service
        return "redirect:/quiz/manage"; // Redirect ke halaman manage quizzes
    }


    // Form untuk menambahkan soal ke quiz
    @GetMapping("/{quizId}/add-question")
    public String addQuestionForm(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("question", new Question()); // Objek baru untuk binding
        }
        return "admin/add_question"; // Path ke template add_question.html
    }

    // Menyimpan soal baru
    @PostMapping("/{quizId}/save-question")
    public String saveQuestion(@PathVariable Long quizId, @ModelAttribute Question question) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            question.setQuiz(quiz);
            quiz.getQuestions().add(question);
            quizService.saveQuiz(quiz); // Simpan quiz beserta soal baru
        }
        return "redirect:/quiz/manage"; // Redirect ke halaman manage quizzes
    }

    // Menampilkan halaman edit quiz dan pertanyaannya
    @GetMapping("/{quizId}/edit")
    public String editQuizForm(@PathVariable Long quizId, Model model) {
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz != null) {
            model.addAttribute("quiz", quiz);
            model.addAttribute("questions", quiz.getQuestions());
        }
        return "admin/edit_quiz"; // Path ke template edit_quiz.html
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
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
    }



=======
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    // Menampilkan halaman quiz untuk user
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
>>>>>>> 446fcb8115662c5ed03b22b5cead0fa19560d49a
>>>>>>> 73509598a7aef48b7d6a53f3dea5dc27928b7dd6
>>>>>>> f71b585d6fc21b12e593362ac78565e4dd8b52e1
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        if (quizId == null) {
            throw new IllegalArgumentException("Quiz ID cannot be null");
        }

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
        Collections.shuffle(quiz.getQuestions());

        model.addAttribute("quiz", quiz);
        model.addAttribute("quizId", quizId);

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
        // Mendapatkan quiz berdasarkan ID
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        Quiz quiz = quizService.getQuizById(quizId);
        int score = 0;
        long timeTakenInSeconds = 0;

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
        List<Boolean> userAnswers = new ArrayList<>();
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            String answer = answers.get("answers[" + i + "]");
            Boolean correctAnswer = quiz.getQuestions().get(i).getCorrectAnswer();
            userAnswers.add(Boolean.parseBoolean(answer)); // Simpan jawaban user

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
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
        QuizResult existingResult = quizResultService.getQuizResultByUserAndQuiz(currentUser.getId(), quizId);
        if (existingResult != null) {
            quizResultService.updateQuizResult(existingResult, score, startTime, LocalDateTime.now(), timeTakenInSeconds, userAnswers);
        } else {
            quizResultService.saveQuizResult(currentUser, quiz, score, startTime, LocalDateTime.now(), timeTakenInSeconds, userAnswers);
        }

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
        model.addAttribute("score", score);
        model.addAttribute("timeTakenInSeconds", timeTakenInSeconds);

        return "quiz/result";
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
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8

    // Menampilkan leaderboard untuk quiz tertentu
    @GetMapping("/{id}/leaderboard")
    public String getLeaderboard(@PathVariable("id") Long quizId, Model model) {
        // Validasi apakah quiz ada
        Quiz quiz = quizService.getQuizById(quizId);
        if (quiz == null) {
            throw new IllegalArgumentException("Quiz not found for id: " + quizId);
        }

        // Ambil hasil leaderboard berdasarkan quiz ID
        List<QuizResult> leaderboard = quizResultService.getLeaderboardByQuiz(quizId);

        model.addAttribute("quiz", quiz);
        model.addAttribute("leaderboard", leaderboard);

        return "quiz/leaderboard"; // Menampilkan halaman leaderboard
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
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
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

        // Debugging: periksa nilai "answers"
        System.out.println("Answers: " + quizResult.getAnswers());

        // Ambil semua pertanyaan dari quiz
        List<Question> questions = quiz.getQuestions();

        model.addAttribute("quiz", quiz);
        model.addAttribute("questions", questions);
        model.addAttribute("quizResult", quizResult);

        return "quiz/review"; // Halaman review
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
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


    @PostMapping("/{quizId}/question/{questionId}/delete")
    public String deleteQuestion(@PathVariable Long quizId, @PathVariable Long questionId) {
        quizService.deleteQuestion(questionId);
        return "redirect:/quiz/" + quizId + "/edit"; // Kembali ke halaman edit quiz
    }

<<<<<<< HEAD
    @PostMapping("/{quizId}/delete")
    public String deleteQuiz(@PathVariable Long quizId) {
        quizService.deleteQuizById(quizId);
        return "redirect:/quiz/manage"; // Kembali ke halaman manage quizzes
    }
=======
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8




}
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
