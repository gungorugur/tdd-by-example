package com.ugungor.domain;

public abstract class Money {

    protected Integer amount;
    protected String currency;

    public static Money dollar(Integer amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(Integer amount) {
        return new Franc(amount, "CHF");
    }

    public abstract Money times(Integer multiplier);

    public abstract String currency();

    @Override
    public boolean equals(Object object) {

        Money money = (Money) object;

        return this.amount.equals(money.amount) && this.getClass().equals(money.getClass());
    }
}
