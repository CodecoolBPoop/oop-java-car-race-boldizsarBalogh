package com.codecool.car_race;
import java.util.Random;

public class Truck extends Vehicle {


    int getBreakDownTurnsLeft() {
        return breakDownTurnsLeft;
    }



    private Random random = new Random();

    private int breakDownTurnsLeft = 0;

    Truck(){
        type = "truck";
        speed = 100;
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
