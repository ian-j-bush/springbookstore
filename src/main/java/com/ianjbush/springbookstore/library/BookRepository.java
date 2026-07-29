package com.ianjbush.springbookstore.library;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByContainingTitleOrAuthorIgnoreCase(String title, String author);

    List<Book> findByGenreIgnoreCase(String genre);
}
