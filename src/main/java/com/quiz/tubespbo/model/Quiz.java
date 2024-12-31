package com.quiz.tubespbo.model;

import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;
=======
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
import lombok.ToString;
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd

import java.util.List;

@Entity
@Table(name = "quiz")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Builder
@Entity
@Table(name = "quiz")
public class Quiz {
=======
@Entity
@Table(name = "quiz")
public class Quiz {

>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    private String title;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude  // Menghindari rekursi saat menggunakan toString
    private List<Question> questions;

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}



=======
<<<<<<< HEAD
    @Column(name = "title")
=======
<<<<<<< HEAD
    @Column(name = "title")
=======
<<<<<<< HEAD
    @Column(name = "title")
=======
<<<<<<< HEAD
    @Column(name = "title")
=======
<<<<<<< HEAD
    @Column(name = "title") // Sesuaikan dengan nama kolom di database
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
    private String title;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;
<<<<<<< HEAD
}


=======
<<<<<<< HEAD
}


=======
<<<<<<< HEAD
}


=======
<<<<<<< HEAD

    // Getter dan Setter
}


=======
}
=======
    private String title;  // Judul quiz (misalnya: Math Quiz, History Quiz)

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;  // Soal-soal yang ada dalam quiz
}

>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
