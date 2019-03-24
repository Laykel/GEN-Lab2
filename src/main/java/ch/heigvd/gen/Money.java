package ch.heigvd.gen;

/**
 * Money class
 */
public class Money {
    protected int amount;

    /**
     * Equality method for Money
     * @param object The object to be equal to
     * @return true if the two objects are equal, false else
     */
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
