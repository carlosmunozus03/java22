package oop.instruments.guitar;

public class Guitar {
    //Attributes
    private String brand;
    private String color;
    private String model;
    private String coils; //Active or passive
    private int strings; //Number of strings

    //Constructor


    public Guitar(String brand, String color, String model, String coils, int strings) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.coils = coils;
        this.strings = strings;
    }

    //Methods conectar, tocar, desconectar, guardad
    void PlugIn() {
        System.out.println("The " + this.brand + " is connect and ready to play");
    }

    void Play() {
        System.out.println("The Guitar is already playing and sounds so good!");
    }

    void Unplug() {
        System.out.println("Guitar disconnected");
    }

    void PutAway() {
        System.out.println("The Guitar was kept in the case");
    }
}
