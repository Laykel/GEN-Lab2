package ch.heigvd.gen;

/**
 * Franc class
 */
public class Franc extends Money {
    /**
     * Constructor
     * @param amount the amount the Franc should represent
     */
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    /**
     * Multiply a Franc by a value
     * @param multiplier The value by which to multiply our Franc
     * @return a new Franc object with the correct value
     */
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
}
