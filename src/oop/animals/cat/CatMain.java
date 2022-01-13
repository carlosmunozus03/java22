package oop.animals.cat;

public class CatMain {
    public static void main(String[] args) {
        Cat buddy = new Cat("Buddy", "Grey", "Mestizo", 12, 21.6);
        buddy.Meow();
        buddy.Wakeup();
        buddy.Sleep();
        buddy.Sleep();

        Cat pita = new Cat("Pita", "white", "Mestizo", 10, 15);
        pita.Walk();

        Cat sawyer = new Cat("Sawyer", "Orange", "Mestizo", 9, 17);
        sawyer.Sleep();
    }
}
