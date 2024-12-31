package com.quiz.tubespbo.model;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
=======
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "quiz_result")
public class QuizResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
<<<<<<< HEAD
    @ToString.Exclude
    @JsonBackReference
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
    private User user;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    private int score;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private long timeTakenInSeconds;

    @Transient
    private List<Boolean> answers;
<<<<<<< HEAD

    @Setter
    @Getter
    @Transient
    private List<UserAnswer> userAnswers;

    @Override
    public String toString() {
        return "QuizResult{" +
                "id=" + id +
                ", score=" + score +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", timeTakenInSeconds=" + timeTakenInSeconds +
                '}';
    }
=======
<<<<<<< HEAD
=======
=======
    private User user;  // User yang mengerjakan quiz

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;  // Quiz yang dikerjakan

    private int score;  // Skor yang didapat

    private LocalDateTime startTime;  // Waktu mulai quiz

    private LocalDateTime endTime;  // Waktu selesai quiz

    private long timeTakenInSeconds;  // Waktu yang dibutuhkan (dalam detik)
<<<<<<< HEAD

    @Transient
    private List<Boolean> answers;  // Jawaban user yang tidak disimpan langsung di database
=======
<<<<<<< HEAD

    @Transient
    private List<Boolean> answers;  // Jawaban user yang tidak disimpan langsung di database
=======
<<<<<<< HEAD

    @Transient
    private List<Boolean> answers;  // Jawaban user yang tidak disimpan langsung di database
=======
<<<<<<< HEAD

    @Transient
    private List<Boolean> answers;  // Jawaban user yang tidak disimpan langsung di database
=======
<<<<<<< HEAD

    @Transient
    private List<Boolean> answers;  // Jawaban user yang tidak disimpan langsung di database
=======
<<<<<<< HEAD

    @Transient
    private List<Boolean> answers;  // Jawaban user yang tidak disimpan langsung di database
=======
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
>>>>>>> 23fd02c19f5a531ca4d9ee147db4da0adfb6da26
>>>>>>> a530dfabf63526a2a25ec96db26055beb44f37b8
>>>>>>> 8488b0d30f762d7f7c571fcaedd2ebb0f653d627
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
}
