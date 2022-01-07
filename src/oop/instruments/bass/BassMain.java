package oop.instruments.bass;

public class BassMain {
    public static void main(String[] args) {
        Bass fender = new Bass("Fender", "Green", "Precition", "Passive", 4);
        fender.PlugIn();

        Bass jackson = new Bass("Jackson","Black","Series " +
                "pro", "Active", 4);
        jackson.PlugIn();
    }
}
