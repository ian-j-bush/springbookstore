package com.ianjbush.springbookstore.library;

import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model ) {
        Author author = authorService.findById(id);
        model.addAttribute("name", author.getFirstName() + " " + author.getLastName());
        return "author";
    }
}
