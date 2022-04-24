package com.bethealt.mvc.repositories;
import com.bethealt.mvc.models.*;
import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();
    //retrieves all the books from the database

    List<Book> findByDescriptionContaining(String search);
    //finds books with descriptions containing the search string

    Long countByTitleContaining(String search);
    //counts how many titles contain a certain string

    Long deleteByTitleStartingWith(String search);
    //deletes a book that starts with a specific title

}
