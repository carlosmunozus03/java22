package oop.family;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Carlos", "carlos@email.com", 33);
        person1.setSleep(true);
        person1.Sleep();
        person1.Wakeup();

        Son damian = new Son("Damian");
        damian.Hello();
        damian.Goodbye();

        Daughter sofia = new Daughter("Daughter", "Sofia");
        sofia.GoodAfternoon();
    }
}
