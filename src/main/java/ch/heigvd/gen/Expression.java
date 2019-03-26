package ch.heigvd.gen;

public interface Expression {
    Money reduce(Bank bank, String to);
}
