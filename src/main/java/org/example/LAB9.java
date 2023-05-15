package org.example;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String Username = "root";
        String Password = "1234";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, Username, Password);
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO student(studentID,firstname,lastname,email,deptID) " +
                "VALUES('111111','aaaaa','bbbbb','aaaa@kmutt.ac.th','IT')";
        statement.executeUpdate(sql);

    }catch (ClassNotFoundException ex) {
        Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
    }

}
 }