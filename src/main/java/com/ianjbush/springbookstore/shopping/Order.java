package com.ianjbush.springbookstore.shopping;

import com.ianjbush.springbookstore.useraccount.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_cost")
    private Double totalCost;

    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @OneToMany
    private List<OrderItem> orderItems;

    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User orderingUser;
}
