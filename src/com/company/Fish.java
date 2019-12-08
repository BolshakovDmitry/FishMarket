package com.company;

public class Fish {
    private String name;
    private double price;
    private int daysToExpire;

//    public Fish(String name, double price, int daysToExpire) {
//        this.name = name;
//        this.price = price;
//        this.daysToExpire = daysToExpire;
//    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }
}
