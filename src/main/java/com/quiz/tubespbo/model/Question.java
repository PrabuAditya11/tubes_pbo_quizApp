package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_text") // Nama kolom di database
    private String questionText;

    @Column(name = "correct_answer") // Nama kolom di database
    private Boolean correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quiz_id") // Nama kolom foreign key
    private Quiz quiz;
}
