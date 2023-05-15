package org.example;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB13 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String Username = "root";
        String Password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, Username, Password);
            Statement statement = connection.createStatement();
            String sql = "UPDATE student SET email = ?"
                    + "WHERE studentID = ?";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,"zzzz@kmutt.ac.th");
            preparedStatement.setString(2,"111111");
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB13.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB13.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
