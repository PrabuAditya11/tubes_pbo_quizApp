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

@Entity
@Table(name = "question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820

@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Builder
@Entity
@Table(name = "question")
public class Question {
=======
@Entity
@Table(name = "question")
public class Question {
<<<<<<< HEAD

=======
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
    @Column(name = "question_text")
    private String questionText;

    @Column(name = "correct_answer")
    private Boolean correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
<<<<<<< HEAD
    @ToString.Exclude  // Menghindari rekursi saat menggunakan toString
    private Quiz quiz;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}



=======
    private Quiz quiz;

<<<<<<< HEAD
}


=======
<<<<<<< HEAD
}


=======
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
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
