package com.ianjbush.springbookstore.library;

import com.ianjbush.springbookstore.shopping.OrderItem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 2000)
    private String description;

    @Column(nullable = false)
    private Integer length;

    @Column
    private String isbn;

    @Column(name = "current_price", nullable = false)
    private String currentPrice;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToMany(mappedBy = "bibliography")
    private Set<Author> authors;

    @OneToMany(mappedBy = "book")
    private List<OrderItem> orders;
}
