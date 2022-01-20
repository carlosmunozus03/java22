package oop.vehicle.helicopter;

public class HelicopterMain {
    public static void main(String[] args) {
        Helicopter apache = new Helicopter("Apache", "USA", "Attacker", 18000, 2);
        apache.StartEngine();
        apache.StartEngine();

        Helicopter cobra = new Helicopter("Cobra", "USA", "Attacker", 15000, 1);
        cobra.StartEngine();
        cobra.StartEngine();
    }
}
