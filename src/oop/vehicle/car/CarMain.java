package oop.vehicle.car;

public class CarMain {
    public static void main(String[] args) {
        Car ferrari = new Car("Red", "Ferrari", 300, 15000); //Set parameter
        ferrari.TurnOn();
        ferrari.TurnOff();
        ferrari.TurnOn();
        ferrari.Accelerate();
        ferrari.Brake();
        ferrari.TurnOff();

        Car lamborghini = new Car("Blue", "Lamborghini", 320, 18000);
        lamborghini.TurnOn();

        Car mercedes = new Car("Grey", "Mercedes-Benz", 280, 12000);
        mercedes.TurnOn();
    }
}
