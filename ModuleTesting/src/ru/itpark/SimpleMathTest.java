package ru.itpark;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SimpleMathTest {
    private SimpleMath testingMath;

    @Before // выполняется перед каждым методом @Test
    public void setUp() {
        testingMath = new SimpleMath();
    }

    @Test
    public void testSumInRange() {
        int expected = 15;
        int actual = testingMath.sumInRange(4, 6);
        assertEquals(expected, actual);
    }
    @Test
    public void testIsPrimeOnPrime() {
        boolean actual = testingMath.isPrime(7);
        assertTrue(actual);
    }

    @Test
    public void testIsPrimeOnNotPrime() {
        boolean expected = false;
        boolean actual = testingMath.isPrime(78);

        assertEquals(expected, actual);
    }
}
