package dev.forte.service;

import dev.forte.UsersDatabase;
import dev.forte.entity.User;

import java.util.Scanner;

public class UserLoginAndRegistration {

    public static User login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User Name");
        String username = scanner.nextLine();

        // If we find the user in the DB, return them
        User existingUser = findUserByName(username);

        if (existingUser != null) {
            System.out.println("USER FOUND! Logged in as: " + existingUser.getUserName());
            return existingUser;
        } else {
            System.out.println("User not found, try again.");
            return null;
        }
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your desired username: ");
        String newUsername = scanner.nextLine();


        if (findUserByName(newUsername) == null) {

            User newUser = new User(newUsername);
            System.out.println("Successfully registered as " + newUsername);
        } else {
            System.out.println("This username already exists, please try again.");
        }
    }

    private static User findUserByName(String username) {

        for (User user : UsersDatabase.allUsers) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
