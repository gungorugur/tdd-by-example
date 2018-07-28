package com.ugungor;

import com.ugungor.domain.Dollar;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DollarTest {


    @Test
    public void testMultiplication() {

        final Dollar five = new Dollar(5);

        Dollar product = five.times(2);
        assertThat(product.amount, is(10));
        product = five.times(3);
        assertThat(product.amount, is(15));

    }
}
