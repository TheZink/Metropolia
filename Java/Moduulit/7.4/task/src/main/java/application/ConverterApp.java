package application;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import dao.*;
import entity.*;

public class ConverterApp {
    HashMap<String, Double> rates = new HashMap<String, Double>();
    CurrencyDao currencyDao = new CurrencyDao();

    // Metodi hakee kaikki valuutat tietokannasta ja tallentaa ne listaan
    public void getAllCurrency() {
        List<Currency> currencyList = currencyDao.findAll();
        for (Currency currency : currencyList) {
            rates.put(currency.getCode(), currency.getRates());
        }
    }

    // Metodi hakee valuutan tietokannasta (Tarvitsenko?)
    public Currency getCurrency(String code) {
        Currency currency = currencyDao.find(code);
        return currency;
    }

    // Metodi lisää valuutan tietokantaan
    public void addCurrency(String code, String name, double rates) {
        Currency currency = new Currency(code, name, rates);
        currencyDao.persist(currency);
    }

    // Metodi muuntaa valuutan
    public double convertCurrency(String from, String to, double amount) {
        double fromRate = rates.get(from);
        double toRate = rates.get(to);
        return amount * toRate / fromRate;
    }

    // Metodi palauttaa valuuttojen nimet
    public List<String> getNames() {
        return new ArrayList<>(rates.keySet());
    }

}
