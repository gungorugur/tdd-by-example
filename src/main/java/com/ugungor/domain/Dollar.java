package com.ugungor.domain;

public class Dollar extends Money {

    public Dollar(Integer amount, String currency) {
        super(amount, currency);
    }
    
    @Override
    public String currency() {
        return this.currency;
    }
}
