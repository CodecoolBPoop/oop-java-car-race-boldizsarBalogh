package com.codecool.car_race;
import java.util.Random;

public class Weather {
    static Random random = new Random();
    static boolean raining = false;

    public static void setRaining() {
        int randomNumber = random.nextInt(101);
        if (randomNumber <= 30){
           Weather.raining = true;
        }

    }

}
