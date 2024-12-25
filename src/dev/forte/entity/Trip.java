package dev.forte.entity;

import java.util.List;

public class Trip {

    private String tripName;
    private String tripDescription;
    private String startingCity;
    private String endingCity;
    private String startingCoordinates;
    private List<Waypoint> waypoints;


    public Trip(String tripName, String tripDescription, String startingCity, String endingCity, String startingCoordinates) {
        this.tripName = tripName;
        this.tripDescription = tripDescription;
        this.startingCity = startingCity;
        this.endingCity = endingCity;
        this.startingCoordinates = startingCoordinates;

    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getTripDescription() {
        return tripDescription;
    }

    public void setTripDescription(String tripDescription) {
        this.tripDescription = tripDescription;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    public String getEndingCity() {
        return endingCity;
    }

    public void setEndingCity(String endingCity) {
        this.endingCity = endingCity;
    }

    public String getStartingCoordinates() {
        return startingCoordinates;
    }

    public void setStartingCoordinates(String startingCoordinates) {
        this.startingCoordinates = startingCoordinates;
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    @Override
    public String toString() {
        return """
        Trip Details:
        Trip Name: %s
        Trip Description: %s
        Trip Starting City: %s
        Trip Ending City: %s
        Trip Starting Coordinates: %s
        """.formatted(tripName, tripDescription, startingCity, endingCity, startingCoordinates);
    }
}