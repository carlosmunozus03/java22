package oop.instruments.guitar;

public class GuitarMain {
    public static void main(String[] args) {
        Guitar prs = new Guitar("PRS", "Electric Blue", "Deluxe", "Active", 6);
        prs.TurnOn();
        prs.PlugIn();
        prs.TurnOff();
        prs.Unplug();
        prs.PutAway();

    }
}
