package com.ugungor.domain;

public class Dollar {

    public Integer amount;

    public Dollar(Integer amount) {
        this.amount = amount;
    }

    public Dollar times(Integer multiplier) {

        return new Dollar(this.amount * multiplier);
    }
}
