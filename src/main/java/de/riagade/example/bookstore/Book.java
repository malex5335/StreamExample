package de.riagade.example.bookstore;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Book {
    private String title;
    private String subtitle;
    private String author;
    private String description;
    private String publisher;
    private BigDecimal price;
    private LocalDate publishDate;
    private String isbn;
}
