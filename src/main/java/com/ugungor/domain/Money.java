package com.ugungor.domain;

public class Money {

    protected Integer amount;
    protected String currency;

    public Money(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(Integer amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(Integer amount) {
        return new Franc(amount, "CHF");
    }

    public Money times(Integer multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public String currency() {

        return this.currency;
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

    @Override
    public boolean equals(Object object) {

        Money money = (Money) object;

        return this.amount.equals(money.amount) && this.currency.equals(money.currency);
    }
}
