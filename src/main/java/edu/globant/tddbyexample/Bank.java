package edu.globant.tddbyexample;

public class Bank {

    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }

    public int rate(String fromCurrency, String toCurrency) {
        return (fromCurrency.equals("CHF") && toCurrency.equals("USD") ? 2 : 1);
    }

    public void addRate(String fronCurrency, String toCurrency, int rate) {

    }
}
