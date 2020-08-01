package edu.globant.tddbyexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar();
        five.times(2);
        assertEquals(10, five.amount);
    }
}