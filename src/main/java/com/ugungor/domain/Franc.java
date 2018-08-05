package com.ugungor.domain;

public class Franc extends Money {

    public Franc(Integer amount, String currency) {
        super(amount, currency);
    }


    @Override
    public String currency() {
        return this.currency;
    }
}
