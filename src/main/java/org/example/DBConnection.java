package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/product_management_db";
    private static final String USERNAME = "product_manager_user";
    private static final String PASSWORD = "123456";

    public Connection getDBConnection() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}