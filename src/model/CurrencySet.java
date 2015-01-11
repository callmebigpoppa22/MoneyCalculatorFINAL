package model;

import java.util.ArrayList;

public class CurrencySet {

    private ArrayList<Currency> currencySet;

    public CurrencySet() {
        this.currencySet = new ArrayList<>();
    }

    public ArrayList<Currency> getCurrencySet() {
        return currencySet;
    }

    public void add(Currency c) {
        currencySet.add(c);
    }

    public void remove(Currency c) {
        currencySet.remove(c);
    }

    public boolean find(Currency c) {
        return currencySet.contains(c);
    }

    public Currency get(int index) {
        return currencySet.get(index);
    }
}
