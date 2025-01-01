package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_text")
    private String questionText;

    @Column(name = "correct_answer")
    private Boolean correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    @ToString.Exclude  // Menghindari rekursi saat menggunakan toString
    private Quiz quiz;

    // Getter dan Setter
    @Setter
    @Getter
    @Column(name = "duration", nullable = false)
    private int duration; // Durasi soal dalam detik

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", duration=" + duration +
                '}';
    }
}
