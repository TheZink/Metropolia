package model;

import java.util.HashMap;

public class CurrConverter {
    HashMap<String, Double> rates = new HashMap<String, Double>();

    public String convert(String from, String to, String fromAmount) {
        rates.put("USD", 1.0);
        rates.put("EURO", 0.85);
        rates.put("GBP", 0.75);
        rates.put("SEK", 8.69);
        rates.put("JPY", 110.0);

        double amount = Double.parseDouble(fromAmount) * rates.get(from) / rates.get(to);
        String result = String.format("%.2f", amount);

        return result;
    }

}
