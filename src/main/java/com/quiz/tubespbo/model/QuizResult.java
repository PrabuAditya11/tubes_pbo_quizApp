package com.quiz.tubespbo.model;

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
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a

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
>>>>>>> 9fca2ca58408eff5e64e42a1a32eeaff21d2114e
>>>>>>> 380fcff587cd38b8fef92ed8534e4ac3ebd91633
>>>>>>> 1dadf51c5a0d2d359d0ee10664b5adeb7991b4c2
>>>>>>> 4bc7d928408fdf8b98ee62bf2e985e1eaefb6a7a
}
