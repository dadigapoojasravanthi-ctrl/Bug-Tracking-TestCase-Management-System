package com.bugtracker;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    // Database URL
    private static final String URL = "jdbc:mysql://localhost:3306/bugtracker";

    // MySQL Username
    private static final String USER = "root";

    // MySQL Password
    private static final String PASSWORD = "Kokila@2006";

    // Method to establish database connection
    public static Connection getConnection() {

        Connection connection = null;

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {

            System.out.println("Database Connection Failed!");
            e.printStackTrace();

        }

        return connection;
    }
}