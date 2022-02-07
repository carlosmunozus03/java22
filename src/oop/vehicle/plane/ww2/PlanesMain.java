package oop.vehicle.plane.ww2;

public class PlanesMain {
    public static void main(String[] args) {
        Planes mustang = new Planes("United States", "P-51 Mustang", "Fighter", 1);
        mustang.StartEngine();
        mustang.StartEngine();
        mustang.Accelerate(); // Added just for Check if its works
        mustang.SlowDown();
        mustang.TurnOffEngine();
        mustang.TurnOffEngine();


        Planes bf109 = new Planes("Germany", "Bf-109 Messerschmitt", "Fighter", 1);
        bf109.StartEngine();
        bf109.StartEngine();

        Bombers b25 = new Bombers("USA", "B-25C Mitchell", "Tactical Bomber", 2, "B-25C Mitchell", 8);
        b25.StartEngine();
        b25.Accelerate();
        b25.OpenBombsGate();
        b25.CloseBombsGate();
    }
}
