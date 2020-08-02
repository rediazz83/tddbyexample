package edu.globant.tddbyexample;

public class Dollar extends Money {

    private String currency;

    Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    protected String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
