package com.ugungor;

import com.ugungor.domain.Franc;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FrancTest {

    @Test
    public void testMultiplication() {

        final Franc five = new Franc(5);
        assertThat(five.times(2), is(new Franc(10)));
        assertThat(five.times(3), is(new Franc(15)));
    }
}
