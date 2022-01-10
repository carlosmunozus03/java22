package oop.animals.dog;

public class DogMain {
    public static void main(String[] args) {
        Dog charlie = new Dog("Charlie", "Large", "Black", "Doberman", 41.5);
        charlie.Sniff();

        Dog moose = new Dog("Moose", "Large", "Black", "Mestizo", 38);
        moose.Sniff();
    }
}
