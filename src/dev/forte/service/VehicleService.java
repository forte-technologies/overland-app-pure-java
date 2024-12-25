package dev.forte.service;

import dev.forte.entity.Trip;
import dev.forte.entity.User;
import dev.forte.entity.Vehicle;

import java.util.Scanner;

public class VehicleService {

    public static void addVehicle(User user){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the vehicle-adder!");

        System.out.println("Enter Vehicle Make:");
        String make = scanner.nextLine();

        System.out.println("Enter Vehicle Model");
        String model = scanner.nextLine();

        System.out.println("Enter Vehicle Drivetrain");
        String drivetrain = scanner.nextLine();

        System.out.println("Enter Vehicle Fuel Type");
        String fuelType = scanner.nextLine();

        user.getVehicles().add(new Vehicle(make,model,drivetrain,fuelType));

        System.out.println("Vehicle successfully added.");
    }

    public static void vehicleViewer(User user){
        System.out.println(user.getVehicles());
    }

    public static void vehicleFinder(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model of vehicle you are looking to view.");

        String vehicleModel = scanner.nextLine();
        boolean found = false;

        for (Vehicle vehicle : user.getVehicles()){
            if (vehicle.getModel().contains(vehicleModel)){
                System.out.println(vehicle);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle not found.");
        }
    }

}
