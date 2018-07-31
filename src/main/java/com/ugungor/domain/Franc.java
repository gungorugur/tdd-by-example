package com.ugungor.domain;

public class Franc extends Money {

    public Franc(Integer amount, String currency) {

        this.amount = amount;
        this.currency = currency;
    }

    public Money times(Integer multiplier) {

        return new Franc(this.amount * multiplier, null);
    }

    @Override
    public String currency() {
        return this.currency;
    }
}
