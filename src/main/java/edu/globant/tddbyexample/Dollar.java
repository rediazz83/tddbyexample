package edu.globant.tddbyexample;

public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }
}
