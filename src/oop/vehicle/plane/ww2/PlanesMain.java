package oop.vehicle.plane.ww2;

public class PlanesMain {
    public static void main(String[] args) {
        Planes mustang = new Planes("United States", "P-51 Mustang", "Fighter", 1);
        mustang.StartEngine();
        mustang.StartEngine();
        mustang.TurnOffEngine();
        mustang.TurnOffEngine();

        Planes bf109 = new Planes("Germany", "Bf-109 Messerschmitt", "Fighter", 1);
        bf109.StartEngine();
        bf109.StartEngine();
    }
}
