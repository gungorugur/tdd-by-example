package com.ugungor.domain;

public class Dollar extends Money {


    public Dollar(Integer amount) {

        this.amount = amount;
        this.currency = "USD";
    }

    public Money times(Integer multiplier) {

        return new Dollar(this.amount * multiplier);
    }

    @Override
    public String currency() {
        return this.currency;
    }
}
