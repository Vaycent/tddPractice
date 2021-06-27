package com.uperform.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    @Test
    void should_return_42() {
        Tester tester = new Tester();
        assertThat(tester.code(), is(42));
        assertEquals(tester.code(), 42);
    }
}
