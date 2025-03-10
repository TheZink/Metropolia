package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInitializer {
    public DatabaseInitializer() {}

    public void initialize() {
        String jdbcUrl = "jdbc:mariadb://localhost:3306/";
        String username = "appuser";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                DatabaseInitializer.class.getResourceAsStream("/initialize.sql")))) {

            StringBuilder sql = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sql.append(line).append("\n");
            }

            String[] sqlStatements = sql.toString().split(";");

            for (String sqlStatement : sqlStatements) {
                if (!sqlStatement.trim().isEmpty()) {
                    statement.execute(sqlStatement.trim());
                }
            }

            System.out.println("Database initialized successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error initializing database: " + e.getMessage());
        }
    }
}