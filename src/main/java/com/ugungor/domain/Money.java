package com.ugungor.domain;

public abstract class Money {

    protected Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    public static Money dollar(Integer amount) {
        return new Dollar(amount);
    }

    public abstract Money times(Integer multiplier);

    @Override
    public boolean equals(Object object) {

        Money money = (Money) object;

        return this.amount.equals(money.amount) && this.getClass().equals(money.getClass());
    }
}
