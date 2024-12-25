package dev.forte.service;

import dev.forte.entity.Trip;
import dev.forte.entity.User;

import java.util.Scanner;

public class TripService {

    public static void newTrip(User user){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the trip-adder!");

        System.out.println("Enter trip name:");
        String tripName = scanner.nextLine().toLowerCase();

        System.out.println("Enter Trip Description");
        String tripDescription = scanner.nextLine();

        System.out.println("Enter Starting City");
        String startingCity = scanner.nextLine();

        System.out.println("Enter Ending City");
        String endingCity = scanner.nextLine();

        System.out.println("Enter Starting Coordinates");
        String startingCoordinates = scanner.nextLine();

        user.getTrips().add(new Trip(tripName, tripDescription,startingCity,endingCity,startingCoordinates));

        System.out.println("Trip added for user: " + user.getUserName());

    }

    public static void tripViewer(User user){
        System.out.println(user.getTrips());
    }

    public static void tripFinder(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of trip you are looking to view.");

        String tripName = scanner.nextLine();
        boolean found = false;

        for (Trip trip : user.getTrips()){
            if (trip.getTripName().contains(tripName.toLowerCase())){
                System.out.println(trip);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Trip not found.");
        }
    }

}
