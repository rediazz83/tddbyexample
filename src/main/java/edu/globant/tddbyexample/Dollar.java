package edu.globant.tddbyexample;

public class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
