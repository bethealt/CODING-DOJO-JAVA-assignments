package com.bethealt.mvc.services;
import com.bethealt.mvc.models.*;
import com.bethealt.mvc.repositories.BookRepository;

import org.springframework.stereotype.Service;
import java.util.*;

@Service

public class BookService {

    private final BookRepository bookRepository;
    //adds the book repository as a dependency

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        }
        else {
            return null;
        }
    }

}
