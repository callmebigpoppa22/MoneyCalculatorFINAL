/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Currency;
import model.CurrencySet;
import model.ExchangeRateSet;
import view.ExchangeRateLoader;
import view.CurrencySetLoader;

/**
 *
 * @author nano
 */
public class Test {
    
    public static void main(String[] args) {
        
    }
    
    public void test() {
        CurrencySet c = new CurrencySetLoader().load();
        ExchangeRateSet e = new ExchangeRateLoader().load(c);
    }
    
}
