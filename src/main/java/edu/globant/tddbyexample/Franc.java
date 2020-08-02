package edu.globant.tddbyexample;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return null;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
