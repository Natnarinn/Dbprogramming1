package org.example;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String Username = "root";
        String Password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, Username, Password);
            String sql = "INSERT INTO student(studentID,firstname,lastname,email,deptID) " +
                    "VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,"111111");
            preparedStatement.setString(2,"aaaa");
            preparedStatement.setString(3,"bbbb");
            preparedStatement.setString(4,"aaaa@kmutt.ac.th");
            preparedStatement.setString(5,"IT");
            preparedStatement.executeUpdate(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
