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
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
