package com.jspiders.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        String dbUrl = "jdbc:mysql://localhost:3306/newdb1";
        String userName = "root";
        String password = "Root@123";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Database connection successful...");
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Unable to connect to the database...");
        }
        System.out.println("Program ends...");
    }
}
