package com.ugungor.domain;

public class Money {

    protected Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {

        Money money = (Money) object;

        return this.amount.equals(money.amount) && this.getClass().equals(money.getClass());
    }
}
