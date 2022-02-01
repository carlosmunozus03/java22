package oop.appliance;

public class ApplianceMain {
    public static void main(String[] args) {
        Tv samsung = new Tv("Samsung", 27);
        samsung.TurnOn();
        samsung.TurnOff();
        samsung.ChangeChannel();
        samsung.TurnOn();
        samsung.ChangeChannel();

    }
}
