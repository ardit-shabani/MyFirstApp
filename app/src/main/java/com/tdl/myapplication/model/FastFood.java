package com.tdl.myapplication.model;

public class FastFood {

    private int foodImage;
    private String category;
    private String type;
    private double price;


    public FastFood(int foodImage, String category, String type, double price) {
        this.foodImage = foodImage;
        this.category = category;
        this.type = type;
        this.price = price;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
