package de.riagade.example.bookstore.impl;

import de.riagade.example.bookstore.Book;
import de.riagade.example.bookstore.I_BookLibrary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestBookLibrary implements I_BookLibrary {

    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book findByIsbn(String isbn) {
        for(var book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return new Book();
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
    public int uniqueAuthors() {
        return 0;
    }

    @Override
    public int similarTitles(String title) {
        return 0;
    }
}
