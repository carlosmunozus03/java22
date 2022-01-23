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

        //Abstract Methods are mandatory ???
        Mom mariana = new Mom("Mariana") {

            @Override
            public void GoodMorning() {
                System.out.println("Mom said good morning");
            }

            @Override
            public void GoodAfternoon() {
                System.out.println("Mom said good afternoon");
            }
        };
        mariana.Walk();
        mariana.GoodMorning();
    }
}
