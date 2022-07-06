package de.riagade.example.bookstore;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String errorMessage) {
        super(errorMessage);
    }
}
