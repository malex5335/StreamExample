package de.riagade.example.bookstore;

import de.riagade.example.bookstore.impl.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter;
    I_BookLibrary library;
    I_Wallet wallet;
    String isbn;
    Book book;
    BigDecimal price;

    @BeforeEach
    void setup() {
        library = new TestBookLibrary();
        counter = new Counter(library);
        wallet = new TestWallet();
        isbn = UUID.randomUUID().toString();
        price = BigDecimal.valueOf(50.00f);
        book = new Book();
        book.setIsbn(isbn);
        book.setPrice(price);
        library.addBook(book);
    }

    @Test
    void buyBook_enoughMoney() throws NotEnoughMoneyException, BookNotFoundException {
        // Given
        wallet.add(price);

        // When
        var foundBook = counter.buyBook(isbn, wallet);

        // Then
        assertEquals(book, foundBook);
        assertFalse(wallet.hasEnough(BigDecimal.ONE));
    }

    @Test
    void buyBook_notEnoughMoney() {
        // Given
        wallet.add(price.subtract(BigDecimal.ONE));

        // When
        var exception = assertThrows(NotEnoughMoneyException.class, () -> {
            counter.buyBook(isbn, wallet);
        });

        // Then
        assertNotEquals("", exception.getMessage());
    }

    @Test
    void buyBook_wrongIsbn() {
        // Given
        var wrongIsbn = UUID.randomUUID().toString();

        // When
        var exception = assertThrows(BookNotFoundException.class, () -> {
            counter.buyBook(wrongIsbn, wallet);
        });

        // Then
        assertNotEquals("", exception.getMessage());
    }
}
