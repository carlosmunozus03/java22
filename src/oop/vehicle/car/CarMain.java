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

        //Encapsulation with setter and getter
        mercedes.Accelerate(); // first check
        mercedes.setSpeed(320); // change the speed
        mercedes.Accelerate();
        System.out.println(mercedes.getPrice()); // get price information
        System.out.println(mercedes.getColor());
        mercedes.Color();
        mercedes.setColor("Cherry"); // change color
        System.out.println(mercedes.getColor());
        mercedes.Color();
    }
}
