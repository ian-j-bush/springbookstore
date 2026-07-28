package com.ianjbush.springbookstore.feedback;

import com.ianjbush.springbookstore.useraccount.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Feedback {

    @Column(nullable = false)
    private LocalDateTime submissionDate;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    private User feedbackLeaver;
}
