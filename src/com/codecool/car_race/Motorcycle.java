package com.codecool.car_race;
import java.util.Random;

public class Motorcycle implements Vehicle {
    static int nameNumber = 0;
    private String name;
    private int distanceTraveled = 0;
    int speed = 100;
    int minimumSlow = 5;
    String type = "motorcycle";
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