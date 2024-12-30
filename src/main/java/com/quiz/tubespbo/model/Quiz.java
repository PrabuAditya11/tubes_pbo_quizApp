package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(name = "title") // Sesuaikan dengan nama kolom di database
    private String title;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;
}
=======
    private String title;  // Judul quiz (misalnya: Math Quiz, History Quiz)

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;  // Soal-soal yang ada dalam quiz
}

>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
