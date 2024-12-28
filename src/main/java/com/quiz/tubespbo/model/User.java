package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
<<<<<<< HEAD
@Table(name = "user")
=======
@Table(name ="user")
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nim;

    private String password;

<<<<<<< HEAD
    private String role;

=======
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<QuizResult> quizResults;
}
