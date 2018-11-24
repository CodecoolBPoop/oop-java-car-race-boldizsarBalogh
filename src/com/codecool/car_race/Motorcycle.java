package com.codecool.car_race;
import java.util.Random;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 0;
    private int minimumSlow = 5;
    Motorcycle(){
        type = "motor";
        speed = 100;

        nameNumber++;
        name = "Motorcycle " + nameNumber;
    }

    @Override
    public void moveForAnHour(Race race) {
        Random random = new Random();
        if(Weather.raining){
        distanceTraveled += speed - (minimumSlow + random.nextInt(46));
        }else{
            distanceTraveled += speed;
        }
    }
}