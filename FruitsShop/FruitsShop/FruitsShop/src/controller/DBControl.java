package controller;
import java.sql.*;
public class DBControl {
        Connection conn;
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=fruits";
        String user = "sa";
        String pass = "123456";
        Connection connect = null;
        Statement stmt;
        ResultSet rs;

    public void connectDB() {
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (connect != null) {
                System.out.println("Database Connected.");
            } else {
                System.out.println("Database Connect Failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeDB() {
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
