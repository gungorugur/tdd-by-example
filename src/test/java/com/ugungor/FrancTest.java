package com.ugungor;

import com.ugungor.domain.Money;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FrancTest {

    @Test
    public void testMultiplication() {

        final Money five = Money.franc(5);
        assertThat(five.times(2), is(Money.franc(10)));
        assertThat(five.times(3), is(Money.franc(15)));
    }
}
