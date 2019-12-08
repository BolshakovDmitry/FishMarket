package com.company;

import java.util.ArrayList;

public class Stock {

    static ArrayList<Order> stock = new ArrayList<>();

    public static void addToStock(Order order) {
        stock.add(order);
    }

    public static ArrayList<Order> getStock() {
        return stock;
    }

    public static int searchId(int iD) {
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getOrderId() == iD) return i;
        }
        return -1;
    }
}
