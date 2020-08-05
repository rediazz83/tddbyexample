package edu.globant.tddbyexample;

public class Sum implements Expression {

    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int amount = augmend.reduce(bank, toCurrency).amount + addmend.reduce(bank, toCurrency).amount;
        return new Money(amount, toCurrency);
    }
}
