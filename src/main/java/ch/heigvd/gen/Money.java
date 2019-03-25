package ch.heigvd.gen;

/**
 * Money class
 */
public class Money {
    protected int amount;
    protected String currency;

    /**
     * Constructor
     * @param amount the amount the Dollar should represent
     */
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Factory for dollar objects
     * @param amount
     * @return
     */
    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    /**
     * Factory for franc objects
     * @param amount
     * @return
     */
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    /**
     * Return the currency of the money
     * @return the currency of the money
     */
    String currency() {
        return currency;
    }

    /**
     * Multiply a money by a value
     * @param multiplier The value by which to multiply our money
     * @return a new money object with the correct value
     */
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    /**
     * Equality method for Money
     * @param object The object to be equal to
     * @return true if the two objects are equal, false else
     */
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    /**
     * String represenation of Money object
     * @return a String with a representation of the Money object
     */
    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
