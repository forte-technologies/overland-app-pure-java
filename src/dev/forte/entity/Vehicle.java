package dev.forte.entity;

public class Vehicle {

    private String make;
    private String model;
    private String drivetrain;
    private String fuelType;


    public Vehicle(String make, String model, String drivetrain, String fuelType) {
        this.make = make;
        this.model = model;
        this.drivetrain = drivetrain;
        this.fuelType = fuelType;
    }


    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return """
                Vehicle Details:
                Vehicle Make: %s
                Vehicle Model: %s
                Vehicle Drivetrain: %s
                Vehicle Fuel Type: %s
                \n
                """.formatted(make,model,drivetrain,fuelType);
    }
}
