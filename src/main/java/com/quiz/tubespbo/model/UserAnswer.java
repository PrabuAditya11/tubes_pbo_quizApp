package com.quiz.tubespbo.model;

import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;
=======
<<<<<<< HEAD
import lombok.*;
=======
<<<<<<< HEAD
import lombok.*;
=======
<<<<<<< HEAD
import lombok.*;
=======
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8

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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
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
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======

    @Override
    public String toString() {
        return "UserAnswer{" +
                "id=" + id +
                ", quizResult=" + quizResult +
                ", question=" + question +
                ", userAnswer=" + userAnswer +
                ", timeSpent=" + timeSpent +
                ", score=" + score +
                '}';
    }
}
=======
    // Constructor untuk kemudahan inisialisasi
    public UserAnswer(QuizResult quizResult, Question question, Boolean userAnswer) {
        this.quizResult = quizResult;
        this.question = question;
        this.userAnswer = userAnswer;
    }
}
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
>>>>>>> 12ebcdc7acbb4b7de228f05ec15218a1b7d417f8
