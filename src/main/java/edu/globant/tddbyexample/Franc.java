package edu.globant.tddbyexample;

public class Franc extends Money {

    private String currency;

    Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    @Override
    protected String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
