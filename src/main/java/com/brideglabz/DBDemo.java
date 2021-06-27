package com.brideglabz;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBDemo {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
        String userName = "root";
        String password = "Thameem123";
        Connection connection;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.printf("Driver loaded!");
        } catch(ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        try{
            System.out.printf("Connecting to database:" +jdbcURL);
            System.out.println("salman");
            connection = DriverManager.getConnection(jdbcURL, userName,password);
            System.out.printf("Connection is successful!!!!" +connection);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}