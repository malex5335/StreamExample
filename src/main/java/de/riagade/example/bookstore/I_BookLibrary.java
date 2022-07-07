package de.riagade.example.bookstore;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.Map;

public interface I_BookLibrary {

    void addBook(Book book);

    Book findByIsbn(String isbn) throws BookNotFoundException;

    List<Book> findByTitle(String title);

    List<Book> booksOlderThan(LocalDate publishDate);

    List<Book> booksNewerThan(LocalDate publishDate);

    List<String> uniqueAuthorsSince(LocalDate publishDate);

    List<String> uniqueAuthorsBefore(LocalDate publishDate);

    Map<Year, List<Book>> booksByYear();

    Map<String, String> authorByIsbn();

    Map<String, Book> bookByIsbn();

    int uniqueAuthors();

    int similarTitles(String title);
}
