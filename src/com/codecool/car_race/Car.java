package com.codecool.car_race;
import java.util.Random;



public class Car implements Vehicle {
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


    private String name;
    private int distanceTraveled = 0;
    private int speed;
    private String type = "car";
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
