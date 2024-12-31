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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    @JsonBackReference
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
