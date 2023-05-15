package org.example;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB11 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String Username = "root";
        String Password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, Username, Password);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM student"
                    + "WHERE studentID = '111111'";
            statement.executeQuery(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
