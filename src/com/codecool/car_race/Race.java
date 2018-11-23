package com.codecool.car_race;

import java.util.List;

public class Race {
    Race race = new Race();
   List<Vehicle> vehicles;

    void createVechicles(){
        for(int i = 1; i <= 10; i++){
            vehicles.add(new Car());
            vehicles.add(new Truck());
            vehicles.add(new Motorcycle());
        }

    }
    boolean isThereABrokenDownTruck(){
        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof Truck && ((Truck) vehicle).breakDownTurnsLeft > 2){
                return true;
            }
        }
        return false;
    }
    void simulateRace(){
        Weather.setRaining();
        for(int i = 1; i <= 50; i++){
            for(Vehicle vehicle : vehicles){
                vehicle.moveForAnHour(race);
            }
        }
    }

    void printRaceResults(){

    }


}
