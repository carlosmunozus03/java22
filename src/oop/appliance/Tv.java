package oop.appliance;

public class Tv {
    //Attributes
    private String brand;
    private double size;
    boolean powerUp = false; //TurnOff
    //Constructor

    public Tv(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }


    //Methods
    public void TurnOn() {
        if (powerUp == false) {
            System.out.println(this.brand + " has turned on an ready to use");
            powerUp = true;
        } else {
            System.out.println(this.brand + " is already turned on...");
        }
    }

    public void ChangeChannel() {
        if (powerUp == true) {
            System.out.println(this.brand + " is changing channels");

        } else {
            System.out.println("Please turn on the Tv before change the channels...");
        }
    }


    public void TurnOff() {
        if (powerUp == true) {
            System.out.println(this.brand + " has turned off");
            powerUp = false;
        } else {
            System.out.println(this.brand + " is already off");
        }
    }
    //Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isPowerUp() {
        return powerUp;
    }

    public void setPowerUp(boolean powerUp) {
        this.powerUp = powerUp;
    }
}
