package dev.forte.service;

import dev.forte.entity.Trip;
import dev.forte.entity.User;
import dev.forte.entity.Vehicle;

import java.util.Scanner;

public class UserService {

    /**
     * Print out the user menu commands.
     */
    public static void printUserMenu() {
        System.out.println("""
                Use the following commands:
                "Add Vehicle"
                "Add Trip"
                "Add Waypoint"
                "Update Trip"
                "Update Vehicle"
                "View Trips"
                "View Specific Trip"
                "View Vehicles"
                "View Specific Vehicle"
                "Main Menu"
                """);
    }

    public static void addVehicle(User user) {
        VehicleService.addVehicle(user);
    }

    public static void findVehicle(User user){
        VehicleService.vehicleFinder(user);
    }

// TRIP SERVICES

    public static void addTrip(User user) {
       TripService.newTrip(user);
    }

    public static void viewTrips(User user){
        TripService.tripViewer(user);
    }

    public static void findTrip(User user){
        TripService.tripFinder(user);

    }


    // Additional helper methods for user actions would go here...
}
