package com.codecool.car_race;

import java.util.List;

 class Race {

    boolean isThereABrokenDownTruck(List<Vehicle> vehicles){
        for(Vehicle vehicle: vehicles){
            if(vehicle instanceof Truck && ((Truck) vehicle).getBreakDownTurnsLeft() > 0){
                return true;
            }
        }
        return false;
    }


    void simulateRace(List<Vehicle> vehicles, Race race){
        Weather.setRaining();
        for(int i = 0; i <= 49; i++){
            for(int j = 0; j<= 29; j++){
                vehicles.get(j).moveForAnHour(race);
            }



        }
    }

    void printResults(List<Vehicle> vehicles){
        System.out.println("rain: " + Weather.raining);
        System.out.println("Result:");
        for(Vehicle vehicle: vehicles){
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Name: " + vehicle.getName());
            System.out.println("Distance Traveled: " + vehicle.getDistanceTraveled());
        }


        }

    }




