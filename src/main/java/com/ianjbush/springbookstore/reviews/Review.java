package com.ianjbush.springbookstore.reviews;

import com.ianjbush.springbookstore.useraccount.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User reviewingUser;

    @Column(nullable = false)
    private Integer score;

    @Column(length = 2000)
    private String summary;

    @Column
    private LocalDateTime reviewDate;
}
