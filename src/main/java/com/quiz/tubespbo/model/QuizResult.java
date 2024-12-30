package com.quiz.tubespbo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

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
}
