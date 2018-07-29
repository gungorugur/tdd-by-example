package com.ugungor.domain;

public class Franc extends Money {

    public Franc(Integer amount) {
        super(amount);
    }

    public Franc times(Integer multiplier) {

        return new Franc(this.amount * multiplier);
    }

}
