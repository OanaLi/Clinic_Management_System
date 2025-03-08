package Main;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

    private static String url = "jdbc:mysql://localhost:3306/Clinic";
    private static String username = "YOUR_DATABASE_USERNAME";
    private static String password =  "YOUR_DATABASE_PASSWORD";

    public static void main(String[] args) {
        Conexiune();
    }

    public static Connection Conexiune() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connection;
    }
}

