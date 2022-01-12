package oop.vehicle.plane;

public class PlaneMain {
    public static void main(String[] args) {
        Plane american = new Plane("Boeing", "American Airline", "767-300", 2);
        american.TurnOn();
        american.TurnOn();
        american.TurnOff();
        american.TurnOn();
        american.Accelerate();
        american.Brake();
        american.TurnOff();
        american.TurnOff();


        Plane delta = new Plane("Airbus", "Delta Airline", "320-200", 2);
        delta.TurnOn();

        Plane qantas = new Plane("Airbus", "Qantas", "380-800", 4);
        qantas.TurnOn();

        Plane lufthansa = new Plane("Boeing", "Lufthansa", "737-800W", 2);
        lufthansa.TurnOn();
        lufthansa.Accelerate();
        lufthansa.Brake();
        lufthansa.TurnOff();


    }
}
