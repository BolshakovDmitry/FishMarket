package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FishMarket fishMarket = new FishMarket();
        Fish salmon = new FishBuilder().name("Salmon").price(5.00).daysToExpire(5).build();
        Fish salmon2 = new FishBuilder().name("Salmon").price(10.00).daysToExpire(7).build();

        Fish shrimp = new FishBuilder().name("Shrimp").price(7.00).daysToExpire(7).build();
        Fish lobster = new FishBuilder().name("lobster").price(4.00).daysToExpire(9).build();

        fishMarket.buy(salmon,10);
        fishMarket.buy(shrimp,10);
        fishMarket.buy(lobster,10);

        for(Order stockCheck : Stock.stock){
            System.out.println("The warehouse has received goods of " + stockCheck.getFishName() + " with the order id of " + stockCheck.getOrderId() +
                    " and the budget is " + FishMarket.getBudget());
        }

        fishMarket.sell(2);

        System.out.println("-----------------------------");

        for(Order stockCheck : Stock.stock){
            System.out.println("the following remails in stock " + stockCheck.getFishName() + stockCheck.getOrderId());
        }

    }
}
