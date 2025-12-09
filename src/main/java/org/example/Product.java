package org.example;
import java.time.Instant;

public class Product {
    private int id;
    private String name;
    private Instant creationDatetime;
    private Category category;

    // Constructor
    public Product(int id, String name, Instant creation, Category category) {
        this.id = id;
        this.name = name;
        this.creationDatetime = creation;
        this.category = category;
    }

    public Product() {
    }

    //Getters et Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Instant getCreation() {
        return creationDatetime;
    }
    public void setCreation(Instant creation) {
        this.creationDatetime = creation;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    //Method getCategoryName
    public String getCategoryName() {
        return category.getName();
    }
}