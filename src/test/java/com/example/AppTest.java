package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void addsPositiveNumbers() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void addsNegativeNumbers() {
        assertEquals(-5, App.add(-2, -3));
    }

    @Test
    public void addingZeroKeepsTheNumber() {
        assertEquals(7, App.add(7, 0));
    }
}
