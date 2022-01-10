package oop.vehicle.boat;

public class Boat {
    //Attributes
    private String color;
    private String brand;
    private int engine; //Number of engines

    //Constructor

    public Boat(String color, String brand, int engine) {
        this.color = color;
        this.brand = brand;
        this.engine = engine;
    }

    //Methods
    void TurnOn() {
        if (this.engine == 1) {
            System.out.println(this.brand + " start " + this.engine + " engine and is ready to go!");
        } else {
            System.out.println(this.brand + " start " + this.engine + " engines and is ready to go!");
        }
    }

    void Accelerate() {
        if (this.engine == 1) {
            System.out.println(this.brand + " is using  " + this.engine + " engine for move the boat");
        } else {
            System.out.println(this.brand + " is using " + this.engine + " engines for going faster");
        }
    }

    void TurnOff() {
        if (this.engine == 1) {
            System.out.println(this.brand + " turned off " + this.engine + " engine");
        } else {
            System.out.println(this.brand + " turned off all " + this.engine + " engines");
        }
    }
}
