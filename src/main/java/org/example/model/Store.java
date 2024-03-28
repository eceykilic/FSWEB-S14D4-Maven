package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Chocolate", 5, "Delicious chocolate bar"),
                new Coke("Drink", 10, "Refreshing cola drink"),
                new Bread("Food", 15, "Freshly baked bread")
        };

        listProducts(products);
    }
}