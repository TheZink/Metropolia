package controller;

import model.Currency;
import model.Converter;
import dao.*;
import java.util.*;

public class CurrController {
    private CurrencyDao currencyDao;
    private Converter converter;
    public boolean dbStatus;

    // Alustetaan valuuttakontrolleri
    public CurrController() {
        dbStatus = false;
        currencyDao = new CurrencyDao();
        converter = new Converter();
        
        try {
            List <Currency> currencyList = currencyDao.getAllCurrencies();
            dbStatus = true;
            System.out.println(dbStatus);
            for (Currency currency : currencyList) {
                converter.setRates(currency.getName(), currency.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Metodi palauttaa valuutan muunnoksen
    public String convert(String from, String to, String amount) {
        if (amount.contains(",")) {
            amount = amount.replace(",", ".");
        }

        String result = converter.getRate(from, to, amount);
        return result;
    }

    // Metodi palauttaa valuuttojen nimet
    public List<String> getCurrencyNames() {
        return converter.getCurrencyNames();
    }
}
