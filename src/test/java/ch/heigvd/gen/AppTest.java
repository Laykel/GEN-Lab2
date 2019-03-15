package ch.heigvd.gen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for simple App.
 */
public class AppTest {
    /**
     * Test multiplication of a Dollar object
     */
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
