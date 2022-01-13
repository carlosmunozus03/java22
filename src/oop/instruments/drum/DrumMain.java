package oop.instruments.drum;

public class DrumMain {
    public static void main(String[] args) {
        Drum pearl = new Drum("Orange", "Pearl", 8);
        pearl.Play();

        Drum tama = new Drum("Blue", "Tama", 12);
        tama.Play();
    }
}
