package ch.heigvd.gen;

/**
 * Money class
 */
public class Money implements Expression {
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
        return new Money(amount, "USD");
    }

    /**
     * Factory for franc objects
     * @param amount
     * @return
     */
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    /**
     * Return the currency of the money
     * @return the currency of the money
     */
    String currency() {
        return currency;
    }

    /**
     * Reduce expression
     * @param to
     * @return
     */
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    /**
     * Multiply a money by a value
     * @param multiplier The value by which to multiply our money
     * @return a new money object with the correct value
     */
    Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    /**
     * Sum a Money object with another
     * @param addend
     * @return
     */
    Expression plus(Expression addend) {
        return new Sum(this, addend);
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
