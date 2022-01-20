package oop.vehicle.helicopter;

public class Helicopter {
    //Attributes
    private String model;
    private String national;
    private String function;
    private int price;
    private int numberOfEngines;

    //boolean = true (engine off)
    //boolean = false (engine on)
    boolean off = true;

    //Constructor


    public Helicopter(String model, String national, String function, int price, int numberOfEngines) {
        this.model = model;
        this.national = national;
        this.function = function;
        this.price = price;
        this.numberOfEngines = numberOfEngines;
    }

    //Methods
    public void StartEngine() {
        if (off == true) {
            if (numberOfEngines == 1) {
                System.out.println(this.model + " has started its engine");
            } else {
                System.out.println(this.model + " has started its " + this.numberOfEngines + " engines");
            }
            off = false;
        } else {
            if (numberOfEngines == 1) {
                System.out.println(this.model + " already has started its engine running");
            } else {
                System.out.println(this.model + " already has started its " + this.numberOfEngines + " engines " +
                        "running");
            }
        }

    }

    public void Accelerate() {

    }

    public void TurnOff() {

    }

    //Setter and Getter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
}
