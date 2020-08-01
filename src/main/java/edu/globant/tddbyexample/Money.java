package edu.globant.tddbyexample;

public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    public static Dollar dollar(int amount){
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && this.getClass().equals(object.getClass());
    }
}
