package com.ugungor.domain;

public class Dollar {

    public Integer amount;

    public Dollar(Integer amount) {
        this.amount = amount;
    }

    public Dollar times(Integer multiplier) {

        return new Dollar(this.amount * multiplier);
    }

    public boolean equals(Object object) {

        Dollar dollar = (Dollar) object;

        return this.amount == dollar.amount;
    }
}
