package oop.instruments.drum;

public class Drum {
    //Attributes
    private String color;
    private String brand;
    private int tombs; // Number of tombs

    //Constructor


    public Drum(String color, String brand, int tombs) {
        this.color = color;
        this.brand = brand;
        this.tombs = tombs;
    }

    //Methods tocar
    void Play() {
        System.out.println("tomb tomb tomb ... " + this.brand + " playing its " + this.tombs + " tombs and the groove" +
                " is really good!");
    }
}
