package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        for (int i = 1; i < 11; i++) {
            assertNotEquals(i, 0);
            assertNotNull(i);
        }
    }

    @Test
    public void writeSequence() {
        int i = 5;

        if(i < 1)
            throw new IllegalArgumentException();
        assertNotEquals(i, 0);

        if(i == 1) {
            System.out.print("1");
            return;

        }
        assertNotEquals(i, 1);
        if(i == 2) {
            System.out.print("1 1");
            return;
        }
        assertNotEquals(i, 2);

        int outSideNumbers = (int) Math.ceil(i/2.0);
        assertEquals(i, 5);
        assertEquals(outSideNumbers, 3);
    }
}