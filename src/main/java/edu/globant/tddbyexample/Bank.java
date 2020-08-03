package edu.globant.tddbyexample;

public class Bank {

    public Money reduce(Expression source, String toCurrency) {
        Sum sum = (Sum) source;
        int amount = sum.augmend.amount + sum.addmend.amount;
        return new Money(amount, toCurrency);
    }
}
