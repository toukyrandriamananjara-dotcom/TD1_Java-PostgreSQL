package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        DataRetriever dataRetriever = new DataRetriever();

        // Test getAllCategories()
        System.out.println("Total number of category:");
        List<Category> categories = dataRetriever.getAllCategories();
        System.out.println("Total number of category: " + categories.size());

        for (Category category : categories) {
            System.out.println("ID: " + category.getId() + ", Nom: " + category.getName());
        }


        // Test getProductList()
        System.out.println("Test getProductList(page, size):");

        int[][] testCases = {
                {1, 10},
                {1, 6},
                {1, 3},
                {2, 2}
        };

        for (int[] testCase : testCases) {
            int page = testCase[0];
            int size = testCase[1];

            System.out.println("\nPage: " + page + ", Taille: " + size);
            List<Product> products = dataRetriever.getProductList(page, size);
            System.out.println("Produits récupérés: " + products.size());

            for (Product product : products) {
                System.out.println("  - " + product.getId() + ": " + product.getName());
            }
        }
    }
}