package de.riagade.example.bookstore;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class LibraryAroundTheCorner implements I_BookLibrary {
    private List<Book> bookList;

    public LibraryAroundTheCorner() {
        setBookList(new ArrayList<>());
    }

    @Override
    public void addBook(Book book) {
        getBookList().add(book);
    }

    @Override
    public Book findByIsbn(String isbn) throws BookNotFoundException {
        throw new BookNotFoundException(String.format("for isbn %s", isbn));
    }

    @Override
    public List<Book> findByTitle(String title) {
        return new ArrayList<>();
    }

    @Override
    public List<Book> booksOlderThan(LocalDate publishDate) {
        return new ArrayList<>();
    }

    @Override
    public List<Book> booksNewerThan(LocalDate publishDate) {
        return new ArrayList<>();
    }

    @Override
    public List<String> uniqueAuthorsSince(LocalDate publishDate) {
        return new ArrayList<>();
    }

    @Override
    public List<String> uniqueAuthorsBefore(LocalDate publishDate) {
        return new ArrayList<>();
    }

    @Override
    public Map<Year, List<Book>> booksByYear() {
        return new HashMap<>();
    }

    @Override
    public Map<String, String> authorByIsbn() {
        return new HashMap<>();
    }

    @Override
    public Map<String, Book> bookByIsbn() {
        return new HashMap<>();
    }

    @Override
    public int uniqueAuthors() {
        return 0;
    }

    @Override
    public int similarTitles(String title) {
        return 0;
    }
}
