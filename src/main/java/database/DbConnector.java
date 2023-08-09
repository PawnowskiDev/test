package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    static String DB_URL = "jdbc:mysql://127.0.0.1:3306/school_ex";
    static String DB_USER = "root";
    static String DB_PASS = "123";

    public static Connection getConnection ()
            throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
