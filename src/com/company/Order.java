package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Order {
        private String fishName;
        private int amount;
        private int daysBeforeExpire;
        private double orderSum;
        private int orderId;

    public Order(Fish fish, int amount, int daysBeforeExpire) {
        this.fishName = fish.getName();
        this.amount = amount;
        this.daysBeforeExpire = daysBeforeExpire;
        this.orderSum=amount*fish.getPrice();
        Random random = new Random();
        this.orderId= random.nextInt(1000);
    }

    public static double isExpire(Calendar purchaseDate, int daysToExpire){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar currentDate = Calendar.getInstance();

        Calendar expired = Calendar.getInstance();
        expired.set(purchaseDate.get(Calendar.YEAR),purchaseDate.get(Calendar.MONTH),purchaseDate.get(Calendar.DAY_OF_YEAR+daysToExpire));

        Calendar preExpired = Calendar.getInstance();
        preExpired.set(purchaseDate.get(Calendar.YEAR),purchaseDate.get(Calendar.MONTH),purchaseDate.get(Calendar.DAY_OF_YEAR+(daysToExpire-1)));

        System.out.println(format.format(purchaseDate.getTime()));

        if(currentDate.compareTo(preExpired)==0) return 0.8;

        double expireOrNot = currentDate.compareTo(expired);
        if(expireOrNot>=0) return 0;
        else return 1;
    }

    public String getFishName() {
        return fishName;
    }

    public int getAmount() {
        return amount;
    }

    public int daysBeforeExpire() {
        return daysBeforeExpire;
    }

    public double getOrderSum() {
        return orderSum;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
