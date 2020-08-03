package edu.globant.tddbyexample;

public class Sum implements Expression {

    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Money reduce(String toCurrency) {
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, toCurrency);
    }
}
