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
<<<<<<< HEAD
@Table(name = "user")
=======
<<<<<<< HEAD
@Table(name = "user")
=======
<<<<<<< HEAD
@Table(name = "user")
=======
<<<<<<< HEAD
@Table(name = "user")
=======
@Table(name ="user")
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
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
<<<<<<< HEAD
    private String role;

=======
<<<<<<< HEAD
    private String role;

=======
<<<<<<< HEAD
    private String role;

=======
<<<<<<< HEAD
    private String role;

=======
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<QuizResult> quizResults;
}
