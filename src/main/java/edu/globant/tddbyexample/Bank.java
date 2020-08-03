package edu.globant.tddbyexample;

public class Bank {

    public Money reduce(Expression source, String toCurrency) {
        if(source instanceof Money) {
            return (Money) source;
        }

        Sum sum = (Sum) source;
        return sum.reduce(toCurrency);
    }
}
