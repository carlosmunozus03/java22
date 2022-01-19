package oop.family;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Carlos", "carlos@email.com", 33);
        person1.setSleep(true);
        person1.Sleep();
        person1.Wakeup();

        Dad papa1 = new Dad("Lucas", "lucas@email.com", 40);
        papa1.Sleep();
        papa1.setSleep(false);
        papa1.Sleep();

        Son son1 = new Son("Elias", "elias@email.com", 24);
        son1.Sleep();
        son1.setSleep(true);
        son1.Sleep();
    }
}
