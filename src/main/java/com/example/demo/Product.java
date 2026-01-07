package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    private String sku;
    private String name;
    private double price;
    private int quantity;
    private String category;
    
    
    public Product() {}

   
    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}