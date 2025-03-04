package dao;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import datasource.DbConnection;
import model.Currency;

public class CurrencyDao {

    // Metodi hakee kaikki valuutat tietokannasta
    public List<Currency> getAllCurrencies() {
        Connection conn = DbConnection.getConnection();
        String sql = "SELECT name, value FROM currency";
        List<Currency> currencies = new ArrayList<>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                String currencyName = rs.getString("name");
                double value = rs.getDouble("value");
                Currency currency = new Currency(currencyName, value);
                currencies.add(currency);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return currencies;
    }
}
