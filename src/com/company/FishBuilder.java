package com.company;

import java.util.ArrayList;

public class FishBuilder<T extends Fish> {

    private static ArrayList<Fish> fishesType = new ArrayList<>();

    private int indexOfFish;

    private T fish;

    public FishBuilder(){
    }

    public FishBuilder name(String name) {
        indexOfFish = fishesType.indexOf(name);
                fish.setName(name);
        return this;
    }

    public FishBuilder price(double price) {
        if(indexOfFish>=0) {
        Fish tempFish=fishesType.get(indexOfFish);
            fish.setPrice(tempFish.getPrice());
        }
        return this;
    }

    public FishBuilder daysToExpire(int daysToExpire) {
        fish.setDaysToExpire(daysToExpire);
        return this;
    }

    public Fish build(){
        fishesType.add(fish);
        return fish;
    }
}
