package com.codecool.car_race;
import java.util.Random;

public class Truck implements Vehicle {
    String name;
    int distanceTraveled = 0;
    int speed = 100;
    Random random = new Random();
    int breakDownTurnsLeft = 0;
    String type = "truck";
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
