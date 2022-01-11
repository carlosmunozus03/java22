package oop.vehicle.boat;

public class BoatMain {
    public static void main(String[] args) {
        Boat mercury = new Boat("White", "Mercury", 4);
        mercury.TurnOn();
        mercury.Accelerate();
        mercury.TurnOff();

        Boat yamaha = new Boat("Blue", "Yamaha", 1);
        yamaha.TurnOn();

        Boat shark = new Boat("Gray", "Shark", 6);
        shark.Accelerate();
        shark.TurnOff();
    }
}
