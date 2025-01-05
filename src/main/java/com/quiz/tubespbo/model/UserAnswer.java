package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.*;

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

    // Waktu yang dihabiskan untuk menjawab soal
    @Column(name = "time_spent")
    private Long timeSpent; // Waktu dalam detik

    // Skor untuk soal ini
    @Column(name = "score")
    private Integer score; // Skor yang diperoleh untuk soal ini

    // Getter dan Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuizResult getQuizResult() {
        return quizResult;
    }

    public void setQuizResult(QuizResult quizResult) {
        this.quizResult = quizResult;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Boolean getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(Boolean userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Long getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Long timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    // Constructor lengkap
    public UserAnswer(QuizResult quizResult, Question question, Boolean userAnswer, Long timeSpent, Integer score) {
        this.quizResult = quizResult;
        this.question = question;
        this.userAnswer = userAnswer;
        this.timeSpent = timeSpent;
        this.score = score;
    }
}