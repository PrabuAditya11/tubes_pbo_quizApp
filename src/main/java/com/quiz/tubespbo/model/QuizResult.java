package com.quiz.tubespbo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "quiz_result")
public class QuizResult {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    @JsonBackReference
    private User user;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

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
    private long timeTakenInSeconds;

    @Transient
    private List<Boolean> answers;

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
}
