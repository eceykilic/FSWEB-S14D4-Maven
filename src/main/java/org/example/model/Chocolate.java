package org.example.model;

public class Chocolate extends ProductForSale {

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
    }

}