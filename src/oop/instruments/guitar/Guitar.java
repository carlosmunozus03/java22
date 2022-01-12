package oop.instruments.guitar;

public class Guitar {
    //Attributes
    private String brand;
    private String color;
    private String model;
    private String coils; //Active or passive
    private int strings; //Number of strings


    //Boolean Here
    //amplifier = false (turn off)
    //amplifier = true (turn on)
    boolean amplifier = false;
    //Constructor


    public Guitar(String brand, String color, String model, String coils, int strings) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.coils = coils;
        this.strings = strings;
    }

    //Methods conectar, tocar, desconectar, guardad
    void TurnOn() {
        if (amplifier == false) {
            System.out.println("Amplifier is ready to use");
            amplifier = true;
        } else {
            System.out.println("Please turn on the amplifier before play");
        }
    }

    void PlugIn() {
        if (amplifier == true) {
            System.out.println("The " + this.brand + " is connect and ready to play");
        } else {
            System.out.println("Please check if you amplifier is on");
        }
    }

    void Play() {
        System.out.println("The Guitar is already playing and sounds so good!");
    }

    void Unplug() {
        if (amplifier == false) {
            System.out.println("Guitar disconnected");
        } else {
            System.out.println("Please, turn off you amplifier before unplug you instrument");
        }
    }

    void TurnOff() {
        if (amplifier == true) {
            System.out.println("Amplifier is already tuned off");
            amplifier = false;
        } else {
            System.out.println("Turn off the amplifier before unplug the instrument");
        }
    }

    void PutAway() {
        System.out.println("The Guitar was kept in the case");
    }
}
