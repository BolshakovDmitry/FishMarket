package com.company;

import java.util.ArrayList;
import java.util.Calendar;

public class FishMarket {

    Calendar currentDate = Calendar.getInstance();


    private static double budget=1000;

    public static ArrayList<Integer> iDArray = new ArrayList<>();

    public static double getBudget() {
        return budget;
    }

    public boolean buy(Fish fish, int amount){
        double totalAmount = fish.getPrice()*amount;
        if(budget<totalAmount){
            System.out.println("Insufficient funds");
            return false; }
        budget-=totalAmount;
        Order tempOrder = new Order(fish,amount,5);
        iDArray.add( tempOrder.getOrderId());
        Stock.addToStock(tempOrder);
        return true;
    }

    public boolean sell(int iD){
        currentDate.set(2019,12,10); //ставим жесткую дату
        Order fishToSell = Stock.stock.get(iD);
        budget+=fishToSell.getOrderSum()*2*Order.isExpire(currentDate,fishToSell.daysBeforeExpire()); //*2 - 100% наценка
        System.out.println("Added to budget the sum of " + fishToSell.getOrderSum());
        System.out.println("the budget now " + budget);
       //*order.isExpire(currentDate,fishToSell.daysBeforeExpire())*2;
        Stock.stock.remove(iD);
        System.out.println("the " + fishToSell.getFishName() + " is out of the stock");
       return  true;
    }








}
