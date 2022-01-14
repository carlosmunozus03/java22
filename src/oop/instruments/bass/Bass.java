package oop.instruments.bass;

public class Bass {
    //Attributes
    private String brand;
    private String color;
    private String model;
    private String coils; //Active or passive
    private int strings; //Number of strings

    //boolean Here
    //boolean = true (amplifier on)
    //boolean = false (amplifier off)
    boolean amplifier = false;

    //Constructor


    public Bass(String brand, String color, String model, String coils, int strings) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.coils = coils;
        this.strings = strings;
    }

    //Methods conectar, tocar, desconectar, guardad
    void TurnOn() {
        if (amplifier == false) {
            System.out.println("The amplifier is on and ready to rock!!!");
            amplifier = true;
        } else {
            System.out.println("The amplifier is already on!!!");
        }
    }

    void PlugIn() {
        if (amplifier == true) {
            System.out.println("The bass " + this.brand + " is connect and ready to play");
        } else {
            System.out.println("Please, turn on the amplifier before play");
        }
    }

    void Play() {
        System.out.println("The bass " + this.brand + " is already playing and sounds so good!");
    }

    void Unplug() {
        System.out.println(this.brand + " is disconnected");
    }

    void PutAway() {
        System.out.println("The bass " + this.brand + " was kept in the case");
    }

    //setter and getter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCoils() {
        return coils;
    }

    public void setCoils(String coils) {
        this.coils = coils;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public boolean isAmplifier() {
        return amplifier;
    }

    public void setAmplifier(boolean amplifier) {
        this.amplifier = amplifier;
    }
}
