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
        if (numberOfEngines == 1) {
            System.out.println(this.model + " is accelerating its engine and gaining altitude");
        } else {
            System.out.println(this.model + " is accelerating its " + this.numberOfEngines + " engines and " +
                    "gaining altitude");
        }
        System.out.println(this.model + " is already accelerating and flying at cruising speed ");
    }


    public void Decelerate() {
        if (numberOfEngines == 1) {
            System.out.println(this.model + " is decelerating its engine and slowing down to land");
        } else {
            System.out.println(this.model + " is decelerating its " + this.numberOfEngines + " engines and slowing " +
                    "down to land");
        }

        System.out.println(this.model + " is already slowing down and preparing to land");
    }

    public void TurnOff() {
        if (off == false) {
            if (numberOfEngines == 1) {
                System.out.println(this.model + " has already switched off its engine");
            } else {
                System.out.println(this.model + " has already switched off its " + this.numberOfEngines + " engines");
            }
            off = true;
        } else {
            if (numberOfEngines == 1) {
                System.out.println(this.model + " is turning off its engine");
            } else {
                System.out.println(this.model + " is turning off its " + this.numberOfEngines + " engines");
            }
        }
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
