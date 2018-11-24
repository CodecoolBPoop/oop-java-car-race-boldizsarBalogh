package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static List<Vehicle> vehicles = new ArrayList<>();
    /**
     * Creates all the vehicles that will be part of this race.
     */
    private void createVehicles() {
        for(int i = 1; i <= 10; i++){
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }

    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Main main = new Main();
        Race race = new Race();
        main.createVehicles();

        race.simulateRace(vehicles, race);
        race.printResults(vehicles);
    }
}
