package edu.globant.tddbyexample;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public int rate(String fromCurrency, String toCurrency) {
        int rate = fromCurrency.equals(toCurrency) ? 1 : rateMap.get(new Pair(fromCurrency, toCurrency));
        return rate;
    }

    public void addRate(String fromCurrency, String toCurrency, int rate) {
        rateMap.put(new Pair(fromCurrency, toCurrency), rate);
    }
}
