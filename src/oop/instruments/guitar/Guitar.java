package oop.instruments.guitar;

public class Guitar {
    //Attributes
    private String brand;
    private String color;
    private String model;
    private String coils; //Active or passive
    private int strings; //Number of strings

    //Methods conectar, tocar, desconectar, guardad
    void PlugIn() {
        System.out.println("The Guitar is connect and ready to play");
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
