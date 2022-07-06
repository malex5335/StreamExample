package de.riagade.example.bookstore.impl;

import de.riagade.example.bookstore.I_Wallet;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TestWallet implements I_Wallet {

    private BigDecimal amount;

    @Override
    public boolean hasEnough(BigDecimal cost) {
        return getAmount().compareTo(cost) >= 0;
    }

    @Override
    public void subtract(BigDecimal cost) {
        setAmount(getAmount().subtract(cost));
    }

    @Override
    public void add(BigDecimal money) {
        setAmount(getAmount().add(money));
    }
}
