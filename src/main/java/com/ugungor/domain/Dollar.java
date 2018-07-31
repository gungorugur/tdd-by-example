package com.ugungor.domain;

public class Dollar extends Money {

    public Dollar(Integer amount, String currency) {

        this.amount = amount;
        this.currency = currency;
    }

    public Money times(Integer multiplier) {

        return new Dollar(this.amount * multiplier, null);
    }

    @Override
    public String currency() {
        return this.currency;
    }
}
