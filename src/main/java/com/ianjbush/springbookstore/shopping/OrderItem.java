package com.ianjbush.springbookstore.shopping;

import com.ianjbush.springbookstore.library.Book;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column
    private Double price;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
