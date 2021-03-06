package oop.vehicle.plane.modern;

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

        Plane latam = new Plane("Boeing", "LATAM", "737-MAX", 2);
        latam.TurnOn(); //test
        latam.TurnOff();
        latam.setBrand("Airbus"); // change brand
        latam.setModel("321-NEO"); // change model
        latam.TurnOn(); // check test
        latam.TurnOff();

        Cargo fedex = new Cargo("McDouglas", "Fedex", "DC-10", 3);
        fedex.TurnOn();
    }
}
