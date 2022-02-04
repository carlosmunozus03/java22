package oop.vehicle.plane.ww2;

public class Planes {
    //Attributes
    private String nation;
    private String model;
    private String role;
    private int engineNumber;

    boolean powerUp = false;
    //PowerUp = true (engine On)
    //PowerUp = false (engine Off)

    //Constructor


    public Planes(String nation, String model, String role, int engineNumber) {
        this.nation = nation;
        this.model = model;
        this.role = role;
        this.engineNumber = engineNumber;
    }

    //Methods
    public void StartEngine() {
        if (powerUp == false) {
            if (engineNumber == 1) {
                System.out.println(this.model + " from " + this.nation + " has started its engine and is taxiing to " +
                        "runway");
            } else {
                System.out.println(this.model + " from " + this.nation + " has started its " + this.engineNumber + " and " +
                        "is " +
                        "taxiing " +
                        "to runway");
            }
            powerUp = true;
        } else {
            if (engineNumber == 1) {
                System.out.println(this.model + " has already on its engine...");
            } else {
                System.out.println(this.model + " has already on its " + this.engineNumber + " engines... Captain");
            }

        }
    }

    public void Accelerate() {
        if (powerUp == true) {
            if (engineNumber == 1) {
                System.out.println(this.model + " is accelerating its engine, increasing its speed and starting to gain height.");
            } else {
                System.out.println(this.model + " is accelerating its " + this.engineNumber + " engines, increasing its speed and starting to gain height.");
            }
        } else {
            if (engineNumber == 1) {
                System.out.println("Please turn on the engine before accelerate the " + this.role + " aircraft");
            } else {
                System.out.println("Captain... please turn on its " + this.engineNumber + " engines before accelerate the " + this.role + " aircraft");
            }
        }
    }

    public void TurnOffEngine() {
        if (powerUp == true) {
            if (engineNumber == 1) {
                System.out.println(this.model + " is parked an turning off its engine");
            } else {
                System.out.println(this.model + " is parked and turning off its " + this.engineNumber + " engines");
            }
            powerUp = false;
        } else {
            if (engineNumber == 1) {
                System.out.println(this.model + " already turned off its engine");
            } else {
                System.out.println(this.model + " already turned off its " + this.engineNumber + " engines Captain");
            }
        }
    }
    //Getters and Setters

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public boolean isPowerUp() {
        return powerUp;
    }

    public void setPowerUp(boolean powerUp) {
        this.powerUp = powerUp;
    }
}
