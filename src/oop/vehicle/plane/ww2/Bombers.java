package oop.vehicle.plane.ww2;

public class Bombers extends Planes {
    //Attributes
    private String model;
    private int bombsNumber;

    boolean doorBay = false; //Door Close

    //Constructor


    public Bombers(String nation, String model, String role, int engineNumber, String model1, int bombsNumber) {
        super(nation, model, role, engineNumber);
        this.model = model1;
        this.bombsNumber = bombsNumber;
    }

    //Methods
    public void OpenBombsGate() {
        if (doorBay == false) {
            System.out.println(this.model + " has the bomb bay door is open and ready to drop " + this.bombsNumber + " bombs");
            doorBay = true;
        } else {
            System.out.println("The bomb bay door is already open Captain");
        }
    }

    public void CloseBombsGate() {
        if (doorBay == true) {
            System.out.println(this.model + " has dropped its " + this.bombsNumber + " bombs and is closing the bomb bay door");
            doorBay = false;
        } else {
            System.out.println("The bomb bay door is already close Captain");
        }
    }

    //Setters and Getters

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    public int getBombsNumber() {
        return bombsNumber;
    }

    public void setBombsNumber(int bombsNumber) {
        this.bombsNumber = bombsNumber;
    }

    public boolean isDoorBay() {
        return doorBay;
    }

    public void setDoorBay(boolean doorBay) {
        this.doorBay = doorBay;
    }
}
