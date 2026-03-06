package org.example.sandbox.inheritance;
import java.util.*;

public class driver {

    public static void main(String[] args){
        car car = new car();
        truck truck = new truck();
        System.out.println("number of vehicles: "+ Vehicle.getCounter());

        car.setLoadCapacity(5);

        truck.setLoadCapacity(500);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        for (Vehicle vehicle: vehicles) {

            System.out.println(vehicle.getClass().getSimpleName()+" load capacity: "
                    + vehicle.getLoadCapacity());
            vehicle.load();

        }


        car.drives();
        truck.drives();
    }
}
