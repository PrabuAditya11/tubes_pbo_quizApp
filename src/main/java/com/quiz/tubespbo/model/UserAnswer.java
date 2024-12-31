package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "user_answer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relasi ke QuizResult
    @ManyToOne
    @JoinColumn(name = "quiz_result_id", nullable = false)
    private QuizResult quizResult;

    // Relasi ke Question
    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    // Jawaban user
    @Column(name = "user_answer")
    private Boolean userAnswer; // Nilai true/false untuk jawaban user

    // Constructor untuk kemudahan inisialisasi
    public UserAnswer(QuizResult quizResult, Question question, Boolean userAnswer) {
        this.quizResult = quizResult;
        this.question = question;
        this.userAnswer = userAnswer;
    }
}
