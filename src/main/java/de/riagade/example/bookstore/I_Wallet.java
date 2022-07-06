package de.riagade.example.bookstore;

import java.math.BigDecimal;

public interface I_Wallet {

    boolean hasEnough(BigDecimal cost);

    void subtract(BigDecimal cost);

    void add(BigDecimal price);
}
