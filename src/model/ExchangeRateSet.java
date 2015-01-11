/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nano
 */
public class ExchangeRateSet {

    private ArrayList<ExchangeRate> exchangeRateSet;

    public ExchangeRateSet() {
        this.exchangeRateSet = new ArrayList<>();
    }

    public ArrayList<ExchangeRate> getExchangeRateSet() {
        return exchangeRateSet;
    }

    public void add(ExchangeRate e) {
        exchangeRateSet.add(e);
    }

    public void remove(ExchangeRate e) {
        exchangeRateSet.remove(e);
    }

    public boolean find(ExchangeRate e) {
        return exchangeRateSet.contains(e);
    }

    public ExchangeRate get(int index) {
        return exchangeRateSet.get(index);
    }

    public float finder(Currency from, Currency to) {
        for (int i = 0; i < exchangeRateSet.size(); i++) {
            if (exchangeRateSet.get(i).getCurrencyFrom().equals(from) && exchangeRateSet.get(i).getCurrencyTo().equals(to)) {
                return exchangeRateSet.get(i).getRate();
            }
            if (exchangeRateSet.get(i).getCurrencyFrom().equals(to) && exchangeRateSet.get(i).getCurrencyTo().equals(from)) {
                return 1 / (exchangeRateSet.get(i).getRate());
            }
        }
        return 500;
    }
}
