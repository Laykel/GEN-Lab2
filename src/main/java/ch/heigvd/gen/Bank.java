package ch.heigvd.gen;

public class Bank {
    Money reduce(Expression source, String to) {
        if (source instanceof Money)
            return (Money) source;
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
