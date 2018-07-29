package com.ugungor.domain;

public class Franc extends Money {

    public Franc(Integer amount) {

        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(Integer multiplier) {

        return new Franc(this.amount * multiplier);
    }

    @Override
    public String currency() {
        return this.currency;
    }
}
