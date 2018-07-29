package com.ugungor;

import com.ugungor.domain.Dollar;
import com.ugungor.domain.Franc;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DollarTest {


    @Test
    public void testMultiplication() {

        final Dollar five = new Dollar(5);
        assertThat(five.times(2), is(new Dollar(10)));
        assertThat(five.times(3), is(new Dollar(15)));
    }

    @Test
    public void testEquality() {

        assertThat(new Dollar(5).equals(new Dollar(5)), is(Boolean.TRUE));
        assertThat(new Dollar(5).equals(new Dollar(6)), is(Boolean.FALSE));
        assertThat(new Franc(5).equals(new Franc(5)), is(Boolean.TRUE));
        assertThat(new Franc(5).equals(new Franc(6)), is(Boolean.FALSE));
        assertThat(new Franc(5).equals(new Dollar(5)), is(Boolean.FALSE));
    }
}
