package com.ugungor;

import com.ugungor.domain.Money;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DollarTest {


    @Test
    public void testMultiplication() {

        final Money five = Money.dollar(5);
        assertThat(five.times(2), is(Money.dollar(10)));
        assertThat(five.times(3), is(Money.dollar(15)));
    }

    @Test
    public void testEquality() {

        assertThat(Money.dollar(5).equals(Money.dollar(5)), is(Boolean.TRUE));
        assertThat(Money.dollar(5).equals(Money.dollar(6)), is(Boolean.FALSE));
        assertThat(Money.franc(5).equals(Money.franc(5)), is(Boolean.TRUE));
        assertThat(Money.franc(5).equals(Money.franc(6)), is(Boolean.FALSE));
        assertThat(Money.franc(5).equals(Money.dollar(5)), is(Boolean.FALSE));
    }

    @Test
    public void testCurrency() {

        assertThat(Money.dollar(1).currency(), is("USD"));
        assertThat(Money.franc(1).currency(), is("CHF"));
    }
}
