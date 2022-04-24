package com.bethealt.mvc.controllers;
import com.bethealt.mvc.services.*;
import com.bethealt.mvc.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller

public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String index() {
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String books() {
        return "index.jsp";
    }

    @GetMapping("books/{id}")
    public String show(Model model, @PathVariable("id") Long id) {

        System.out.println(id);
        Book book = bookService.findBook(id);
        System.out.println(book);

        model.addAttribute("book", book);

        return "show.jsp";
    }
}
