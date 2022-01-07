package oop.vehicle.plane;

public class Plane {
    //Attributes
    private String brand;
    private String airline;
    private int engines; //Number of engine
    private String model;

    //Constructor


    public Plane(String brand, String airline, String model, int engines) {
        this.brand = brand;
        this.airline = airline;
        this.engines = engines;
        this.model = model;
    }

    //Methods
    void TurnOn() {  // Could use parameters without constructor
//        System.out.println("The Plane is Turned On"); // Change the plane for this.brand
        System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " has started its " + this.engines +
                " engines and" +
                " it ready to go!");
    }

    void Accelerate() {
        System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " is accelerating and " +
                "increase the speed");
    }

    void Brake() {
        System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " is braking and reducing " +
                "the speed");
    }

    void TurnOff() {
        System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " is turned off");
    }

}
