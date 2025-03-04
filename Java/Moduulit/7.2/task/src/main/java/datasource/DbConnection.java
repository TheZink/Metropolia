package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null || isClosed(conn)) {
            try {
                conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/converter?user=appuser&password=appuser");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    private static boolean isClosed(Connection conn) {
        try {
            return conn == null || conn.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }
}
