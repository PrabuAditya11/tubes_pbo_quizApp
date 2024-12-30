package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
import lombok.ToString;

@Entity
@Table(name = "question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
<<<<<<< HEAD
=======
=======

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {
<<<<<<< HEAD

=======
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    @Column(name = "question_text")
    private String questionText;

    @Column(name = "correct_answer")
    private Boolean correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    // Getter dan Setter
}


<<<<<<< HEAD
=======
=======
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
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
