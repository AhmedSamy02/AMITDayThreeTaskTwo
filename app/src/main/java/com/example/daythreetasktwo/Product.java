package com.example.daythreetasktwo;

import android.graphics.drawable.Drawable;

public class Product {
    public Drawable productPicture;

    public String productName;
    public String productDescription;
    public double price;
    public int numberOfProducts = 1;

    public void setMany(Drawable ProductPicture, String ProductName, String ProductDescription) {
        this.productPicture = ProductPicture;
        this.productName = ProductName;
        this.productDescription = ProductDescription;
    }

    public Product() {
    }

    public Product(Drawable ProductPicture, String ProductName, String ProductDescription) {
        this.productPicture = ProductPicture;
        this.productName = ProductName;
        this.productDescription = ProductDescription;
    }

    public String getNumberOfProducts() {
        return Integer.toString(numberOfProducts);
    }

    public String getPrice() {
        return "$" + Double.toString(price);
    }
}
