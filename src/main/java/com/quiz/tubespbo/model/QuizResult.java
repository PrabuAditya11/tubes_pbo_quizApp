package com.quiz.tubespbo.model;

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
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
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
=======
<<<<<<< HEAD
=======
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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "quiz_result")
public class QuizResult {

<<<<<<< HEAD
    @Setter
    @Getter
=======
<<<<<<< HEAD
    @Setter
    @Getter
=======
<<<<<<< HEAD
    @Setter
    @Getter
=======
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    @ToString.Exclude
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    @JsonBackReference
    private User user;

    @Setter
    @Getter
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    @ToString.Exclude
    @JsonBackReference
=======
<<<<<<< HEAD
    @ToString.Exclude
    @JsonBackReference
=======
<<<<<<< HEAD
    @ToString.Exclude
    @JsonBackReference
=======
<<<<<<< HEAD
    @ToString.Exclude
    @JsonBackReference
=======
<<<<<<< HEAD
    @ToString.Exclude
    @JsonBackReference
=======
<<<<<<< HEAD
    @ToString.Exclude
    @JsonBackReference
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> faaea3a1fe5ce7ea63e866e46165e80764a860cd
>>>>>>> cfa69bcfca4ef25d3694fb78d0aefdc3029f6820
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
    private User user;

>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    @Setter
    @Getter
    @Column(name = "score", nullable = false)
    private int score;

    @Setter
    @Getter
    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;


    @Setter
    @Getter
    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Setter
    @Getter
    @Column(name = "time_taken_in_seconds")
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    private int score;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
    private long timeTakenInSeconds;

    @Transient
    private List<Boolean> answers;
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
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a

    @Setter
    @Getter
    @Transient
    private List<UserAnswer> userAnswers;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

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
>>>>>>> 660102dfa1088bfa0bca7b774bd8e0b488a95ef2
>>>>>>> ee0a2a13126d4e9c64349bfa09f2368b72c6b99f
>>>>>>> 5a9eab0d1bd4fdbdf828c371c13bc1e15d30db60
>>>>>>> d7e6079ccc39adb7891cf74591bce1feb827c2c4
>>>>>>> a870c1a246333d683eea73235886f9a370f2cddb
>>>>>>> 7c7e8c136cff5c8198db3339276e0baed3698cb3
>>>>>>> d3dd595c5a7877a2a01dec23dda5b6773c731114
>>>>>>> b5bc5a6f0d0b43d3d33873a99e75bc8cb2c3a12a
}
