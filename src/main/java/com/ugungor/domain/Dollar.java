package com.ugungor.domain;

public class Dollar extends Money {

    public Dollar(Integer amount) {
        super(amount);
    }

    public Money times(Integer multiplier) {

        return new Dollar(this.amount * multiplier);
    }
}
