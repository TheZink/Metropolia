package model;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Converter {
    HashMap<String, Double> rates = new HashMap<String, Double>();

    // Listan alustus valuutoille
    public void setRates(String name, double value) {
        rates.put(name, value);
    }
    
    // Metodi laskee valuutan muunnoksen
    public String getRate(String from, String to, String fromAmount) {
        double amount = Double.parseDouble(fromAmount) * rates.get(from) / rates.get(to);
        String result = String.format("%.2f", amount);

        return result;
    }

    // Metodi palauttaa valuuttojen nimet
    public List<String> getCurrencyNames() {
        return new ArrayList<>(rates.keySet());
    }

}
