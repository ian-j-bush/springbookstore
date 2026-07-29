package com.ianjbush.springbookstore.library;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author findById(Long id ) {
        return authorRepository.findById(id).orElseThrow();
    }
}
