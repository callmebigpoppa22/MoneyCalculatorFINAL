/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.CurrencySet;
import model.ExchangeRate;
import model.ExchangeRateSet;

/**
 *
 * @author nano
 */
public class ExchangeRateLoader {

    public ExchangeRateSet loader(CurrencySet c) {
        ExchangeRateSet set = new ExchangeRateSet();
        set.add(new ExchangeRate(c.getCurrencySet().get(0), c.getCurrencySet().get(0), 1));
        for (int i = 1; i < c.getCurrencySet().size(); i++) {
            set.add(new ExchangeRate(c.getCurrencySet().get(0), c.getCurrencySet().get(i), aleatorio(0, 2)));
        }

        return set;
    }

    public ExchangeRateSet load(CurrencySet c) {
        ExchangeRateSet set = new ExchangeRateSet();
        for (int i = 0; i < c.getCurrencySet().size(); i++) {
            for (int j = 0; j < c.getCurrencySet().size(); j++) {
                if (c.getCurrencySet().get(i).equals(c.getCurrencySet().get(j))) {
                    set.add(new ExchangeRate(c.getCurrencySet().get(i), c.getCurrencySet().get(i), 1));
                } else {
                    set.add(new ExchangeRate(c.getCurrencySet().get(j), c.getCurrencySet().get(i), aleatorio(0, 2)));
                }
            }
        }

        return set;
    }

    private float aleatorio(float max, float min) {
        return (float) (Math.random() < 0.5 ? ((1 - Math.random()) * (max - min) + min) : (Math.random() * (max - min) + min));
    }

}
