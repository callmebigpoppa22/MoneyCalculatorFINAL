/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Currency;
import model.CurrencySet;

/**
 *
 * @author nano
 */
public class CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet c = new CurrencySet();
        c.add(new Currency("usd", "dolar", "$"));
        c.add(new Currency("eur", "euro", "€"));
        c.add(new Currency("gbp", "libra", "P"));
        return c;
    }
}
