package oop.instruments.drum;

public class Drum {
    //Attributes
    private String color;
    private String Brand;
    private int tombs; // Number of tombs

    //Constructor

    public Drum(String color, String brand, int tombs) {
        this.color = color;
        Brand = brand;
        this.tombs = tombs;
    }

    //Methods tocar
    void Play() {
        System.out.println("tomb tomb tomb ... the groove is really good!");
    }
}
