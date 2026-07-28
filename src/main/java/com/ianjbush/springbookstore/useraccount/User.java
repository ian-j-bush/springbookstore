package com.ianjbush.springbookstore.useraccount;

import com.ianjbush.springbookstore.shopping.Order;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(name = "email_address", nullable = false)
    private String emailAddress;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;

    private String role;

    @OneToMany(mappedBy = "orderingUser")
    private Set<Order> orders;
}
