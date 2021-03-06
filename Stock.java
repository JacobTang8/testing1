package com.example.assignment1;

import android.view.View;

public class Stock {
    private int id;
    private String color;
    private double price;


    public Stock(int id, String color, double price) {
        this.id = id;
        this.color = color;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
