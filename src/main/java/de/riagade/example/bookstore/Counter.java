package de.riagade.example.bookstore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counter {

    private I_BookLibrary library;

    public Counter(I_BookLibrary library) {
        setLibrary(library);
    }

    public Book buyBook(String isbn, I_Wallet wallet) throws NotEnoughMoneyException, BookNotFoundException {
        var desiredBook = getLibrary().findByIsbn(isbn);
        var cost = desiredBook.getPrice();
        if(wallet.hasEnough(cost)) {
            wallet.subtract(cost);
            return desiredBook;
        } else {
            throw new NotEnoughMoneyException(String.format("the book you tried to buy costs %s but you don't have enough money in your wallet", cost.toString()));
        }
    }
}
