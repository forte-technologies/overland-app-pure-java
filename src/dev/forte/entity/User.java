package dev.forte.entity;

import dev.forte.UsersDatabase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private static int LAST_ID = 1000;
    private String userName;
    private List<Vehicle> vehicles;
    private List<Trip> trips;
    private int userID;

    public User(String userName) {
        this.userName = userName;
        this.userID = LAST_ID++;
        this.vehicles = new ArrayList<>();
        this.trips = new ArrayList<>();
        UsersDatabase.allUsers.add(this);
    }

    // Getters

    public String getUserName(){
        return userName;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Trip> getTrips() {
        return trips;
    }

}
