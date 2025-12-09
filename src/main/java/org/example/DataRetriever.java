package org.example;

import java.sql.*;
import java.util.*;

public class DataRetriever {
    private DBConnection dbConnection = new DBConnection();

    public List<Category> getAllCategories() throws Exception {
        List<Category> categories = new ArrayList<>();

        Connection connection = dbConnection.getDBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM product_category");

        while (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt("id"));
            category.setName(resultSet.getString("name"));
            categories.add(category);
        }

        connection.close();
        return categories;
    }

    public List<Product> getProductList(int page, int size) throws Exception {
        List<Product> products = new ArrayList<>();

        int offset = (page - 1) * size;
        Connection connection = dbConnection.getDBConnection();
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM product ORDER BY id LIMIT " + size + " OFFSET " + offset;
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name"));
            products.add(product);
        }

        connection.close();
        return products;
    }
}