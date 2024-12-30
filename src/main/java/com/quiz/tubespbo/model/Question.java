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
<<<<<<< HEAD

=======
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(name = "question_text") // Nama kolom di database
    private String questionText;

    @Column(name = "correct_answer") // Nama kolom di database
    private Boolean correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quiz_id") // Nama kolom foreign key
    private Quiz quiz;
=======
    private String questionText;  // Isi soal

    private Boolean correctAnswer;  // Jawaban yang benar (True/False)

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;  // Quiz yang terkait dengan soal ini
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
}
