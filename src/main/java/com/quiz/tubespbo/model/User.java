package com.quiz.tubespbo.model;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
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
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nim;

    private String password;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
    private String role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private List<QuizResult> quizResults;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nim='" + nim + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
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
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<QuizResult> quizResults;
}
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
