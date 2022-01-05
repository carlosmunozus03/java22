package oop.vehicle.plane;

public class Plane {
    //Attributes
    private String brand;
    private String airline;
    private int engines; //Number of engine

    //Methods
    void TurnOn(String brand, String airline) {  // Using parameters
        System.out.println("The Plane is Turned On");
    }

    void Accelerate() {
        System.out.println("The Plane is Accelerating");
    }

    void Brake() {
        System.out.println("The Plane is braking");
    }

    void TurnOff() {
        System.out.println("The Plane is Turned Off");
    }

}
