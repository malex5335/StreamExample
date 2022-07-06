package de.riagade.example.bookstore;

import java.time.LocalDate;
import java.util.List;

public interface I_BookLibrary {

    void addBook(Book book);

    Book findByIsbn(String isbn) throws BookNotFoundException;

    List<Book> findByTitle(String title);

    List<Book> booksOlderThan(LocalDate publishDate);

    List<Book> booksNewerThan(LocalDate publishDate);

    List<String> uniqueAuthorsSince(LocalDate publishDate);

    List<String> uniqueAuthorsBefore(LocalDate publishDate);

    int uniqueAuthors();

    int similarTitles(String title);
}
