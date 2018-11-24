package com.codecool.car_race;
import java.util.Random;

public class Motorcycle implements Vehicle {
    @Override
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
    private static int nameNumber = 0;
    private String name;
    private int distanceTraveled = 0;
    private int speed = 100;
    private int minimumSlow = 5;
    private String type = "motorcycle";
    Motorcycle(){
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