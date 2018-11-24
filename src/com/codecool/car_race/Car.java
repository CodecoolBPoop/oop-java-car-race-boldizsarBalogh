package com.codecool.car_race;
import java.util.Random;



public class Car extends Vehicle {



    private String[] carNames = {
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
        type = "car";
        Random random = new Random();
        String firstName = carNames[random.nextInt(9)];
        String secondName = carNames[random.nextInt(9)];
        name = firstName + " " + secondName;
        speed = 80 + random.nextInt(31);
    }

    @Override
    public void moveForAnHour(Race race) {

        if(race.isThereABrokenDownTruck(Main.vehicles)){
            distanceTraveled += 75;
        }else{
            distanceTraveled += speed;
        }
    }
}
