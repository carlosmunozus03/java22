package oop.vehicle.plane;

public class Plane {
    //Attributes
    private String brand;
    private String airline;
    private int engines; //Number of engine
    private String model;

    //boolean here
    //boolean == true (turn on engines)
    //boolean == false (turn off engines)
    boolean condition = false;
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
        if (condition == false) {
            System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " has started its " + this.engines +
                    " engines and" +
                    " it ready to go!");
            condition = true;
        } else {
            System.out.println("The " + this.brand + " " + this.model + " are " + this.engines + " engines already " +
                    "on!");
        }
    }

    void Accelerate() {
        if (condition == true) {
            System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " is accelerating and " +
                    "increase the speed");
        } else {
            System.out.println("The " + this.brand + " " + this.model + " can't accelerating because it has " + this.engines + " engines off!!!");
        }
    }

    void Brake() {
        System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " is braking and reducing " +
                "the speed");
    }

    void TurnOff() {
        if (condition == true) {
            System.out.println("The " + this.brand + " " + this.model + " of " + this.airline + " is turned off all " +
                    "its " + this.engines + " engines");
            condition = false;
        } else {
            System.out.println("The " + this.brand + " " + this.model + " has " + this.engines + " already off!!!");
        }
    }

}
