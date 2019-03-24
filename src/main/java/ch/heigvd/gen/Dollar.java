package ch.heigvd.gen;

/**
 * Dollar class
 */
public class Dollar extends Money {
    /**
     * Constructor
     * @param amount the amount the Dollar should represent
     */
    Dollar(int amount) {
        this.amount = amount;
    }

    /**
     * Multiply a Dollar by a value
     * @param multiplier The value by which to multiply our Dollar
     * @return a new Dollar object with the correct value
     */
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
