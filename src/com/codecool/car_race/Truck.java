package com.codecool.car_race;
import java.util.Random;

public class Truck implements Vehicle {
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
    int getBreakDownTurnsLeft() {
        return breakDownTurnsLeft;
    }


    private String name;
    private int distanceTraveled = 0;
    private int speed = 100;

    private Random random = new Random();

    private int breakDownTurnsLeft = 0;
    private String type = "truck";
    Truck(){

        name = String.valueOf(random.nextInt(1001));
    }

    @Override
    public void moveForAnHour(Race race) {
        int breakRandom = random.nextInt(101);
        if (breakDownTurnsLeft > 0) {
            breakDownTurnsLeft -= 1;
        } else {
            if (breakRandom <= 5) {
                breakDownTurnsLeft = 2;
            } else {
                distanceTraveled += speed;
            }

        }
    }
}
