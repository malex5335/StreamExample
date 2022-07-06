package de.riagade.example.bookstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryAroundTheCornerTest {

    List<Book> bookList;
    LibraryAroundTheCorner library;

    @BeforeEach
    void setup() {
        bookList = new ArrayList<>();
        library = new LibraryAroundTheCorner();
        library.setBookList(bookList);
    }

    @Test
    void addBook() {
        // Given
        var book = new Book();

        // When
        library.addBook(book);

        // Then
        assertTrue(bookList.contains(book));
    }

    @Test
    void findByIsbn() {

    }

    @Test
    void findByTitle() {

    }

    @Test
    void booksOlderThan() {

    }

    @Test
    void booksNewerThan() {

    }

    @Test
    void uniqueAuthorsSince() {

    }

    @Test
    void uniqueAuthorsBefore() {

    }

    @Test
    void uniqueAuthors() {

    }

    @Test
    void similarTitles() {

    }
}