package com.codecool.car_race;
import java.util.Random;

public class Car implements Vehicle {
    String name;
    int distanceTraveled = 0;
    int speed;
    String type = "car";
    String[] carNames = {
            "Purity",
            "Pinnacle",
            "Resolve",
            "Mastery",
            "Grit",
            "Silver",
            "Dynamics",
            "Wolf",
            "Prestige",
            "Vanish"};
    Car(){
        Random random = new Random();
        String firstName = carNames[random.nextInt(9)];
        String secondName = carNames[random.nextInt(9)];
        name = firstName + " " + secondName;
        speed = 80 + random.nextInt(31);
    }

    @Override
    public void moveForAnHour(Race race) {
        if(race.isThereABrokenDownTruck()){
            distanceTraveled += 75;
        }else{
            distanceTraveled += speed;
        }
    }
}
