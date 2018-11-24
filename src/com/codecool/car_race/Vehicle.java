package com.codecool.car_race;
import java.util.Random;

public interface Vehicle {
    void moveForAnHour(Race race);

    String getName();

    String getType();

    int getDistanceTraveled();

}
