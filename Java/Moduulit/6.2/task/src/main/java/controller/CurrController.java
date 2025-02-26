package controller;

import model.CurrConverter;

public class CurrController {
    private CurrConverter converter = new CurrConverter();

    public String convert(String from, String to, String amount) {
        if (amount.contains(",")) {
            amount = amount.replace(",", ".");
        }
        
        String result = converter.convert(from, to, amount);
        return result;
    }


}
