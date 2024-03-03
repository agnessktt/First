package com.mycompany.app.Week2;

public interface FastFood {
    double getPrice();
    int getCalories();
    String getDescription();
}

public class Sandwich implements FastFood {

    private String name;

    private double price;

    private int calories;

    //existing constructor and other methods

    public double getPrice() {

        return price;

    }
    public int getCalories() {

        return calories;

    }
    public String getDescription() {

        return name + " sandwich";
    }
}