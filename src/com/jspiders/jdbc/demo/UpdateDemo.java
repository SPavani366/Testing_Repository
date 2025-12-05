package com.jspiders.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        String dbUrl = "jdbc:mysql://localhost:3306/appusers";
        String userName = "root";
        String password = "Root@123";
        String updateSql = "update appusers.users set name = 'Pavani' where userid = 1;";
        try{
            Connection con = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connnected to appusers-db successfully...");
            Statement stmt1 = con.createStatement();
            int rowsAffected = stmt1.executeUpdate(updateSql);
            System.out.println(rowsAffected + " row(s) updated");
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Unable to connect to appusers-db...");
        }
        System.out.println("Program ends...");
    }
}
