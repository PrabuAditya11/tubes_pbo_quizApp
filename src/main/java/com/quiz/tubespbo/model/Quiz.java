package com.quiz.tubespbo.model;

import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;

import java.time.LocalDateTime;
=======
<<<<<<< HEAD
import lombok.*;

import java.time.LocalDateTime;
=======
<<<<<<< HEAD
import lombok.*;

import java.time.LocalDateTime;
=======
<<<<<<< HEAD
import lombok.*;

import java.time.LocalDateTime;
=======
<<<<<<< HEAD
import lombok.*;
=======
<<<<<<< HEAD
import lombok.*;
=======
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f

>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
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
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
@Builder
@Entity
@Table(name = "quiz")
public class Quiz {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
=======
@Entity
@Table(name = "quiz")
public class Quiz {

>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
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
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    private String title;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude  // Avoid recursive toString
    private List<Question> questions;

    private LocalDateTime startTime;  // Add start time
    private LocalDateTime endTime;    // Add end time

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
    private String title;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude  // Menghindari rekursi saat menggunakan toString
    private List<Question> questions;

<<<<<<< HEAD
    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude  // Menghindari rekursi saat menggunakan toString
    private List<QuizResult> quizResults;  // Cascade delete for QuizResult

=======
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
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
<<<<<<< HEAD
=======



<<<<<<< HEAD
=======
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
