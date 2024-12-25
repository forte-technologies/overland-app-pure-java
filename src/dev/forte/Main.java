package dev.forte;

import dev.forte.entity.User;
import dev.forte.service.UserLoginAndRegistration;
import dev.forte.service.UserService;
import dev.forte.service.VehicleService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {
        while (true) {
            mainMenu();

            Scanner scanner = new Scanner(System.in);
            String userAction = scanner.nextLine();

            if (userAction.equalsIgnoreCase("login")) {
                // Attempt login
                User currentUser = UserLoginAndRegistration.login();
                // If login is successful, user won't be null
                if (currentUser != null) {
                    // Move to the user menu
                    runUserMenu(currentUser);
                }
            }
            else if (userAction.equalsIgnoreCase("register")) {
                // Register new user
                UserLoginAndRegistration.register();
            }
            else if (userAction.equalsIgnoreCase("quit")) {
                // Quit application
                System.out.println("Exiting application...");
                break;
            }
            else {
                System.out.println("Entry not recognized as a valid command, please try again.");
            }
        }
    }

    private static void mainMenu() {
        System.out.println("""
                Welcome to the Overland Trip Planner. This is the main menu.
                Use the following commands to interact with this app.

                Enter "Login" to login.
                Enter "Register" to register.
                Enter "Quit" to quit application.
                """);
    }


    private static void runUserMenu(User user) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            UserService.printUserMenu();

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("Add Vehicle")) {
                UserService.addVehicle(user);
            }
            else if (choice.equalsIgnoreCase("Add Trip")) {
                UserService.addTrip(user);
            }

            else if (choice.equalsIgnoreCase("View Trips")) {
                UserService.viewTrips(user);
            }
            else if (choice.equalsIgnoreCase("View Specific Trip")) {
               UserService.findTrip(user);
            }
            else if (choice.equalsIgnoreCase("View Vehicles")) {
                VehicleService.vehicleViewer(user);
            }
            else if (choice.equalsIgnoreCase("View Specific Vehicle")) {
               VehicleService.vehicleFinder(user);
            }
            else if (choice.equalsIgnoreCase("Main Menu")) {

                break;
            }
            else {
                System.out.println("Unknown command: " + choice + ". Please try again.");
            }
        }
    }
}
