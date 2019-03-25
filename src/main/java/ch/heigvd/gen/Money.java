package ch.heigvd.gen;

/**
 * Money class
 */
abstract public class Money {
    protected int amount;

    /**
     * Factory for dollar objects
     * @param amount
     * @return
     */
    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    /**
     * Factory for franc objects
     * @param amount
     * @return
     */
    static Money franc(int amount) {
        return new Franc(amount);
    }

    /**
     * Multiply a currency by a factor
     * @param multiplier
     * @return
     */
    abstract Money times(int multiplier);

    /**
     * Equality method for Money
     * @param object The object to be equal to
     * @return true if the two objects are equal, false else
     */
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
