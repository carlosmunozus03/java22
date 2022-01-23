package oop.family;

public class Daughter extends Mom {
    //Attributes
    private String name;

    //Constructor
    public Daughter(String name, String name1) {
        super(name);
        this.name = name1;
    }

    //Abstract Methods
    @Override
    public void GoodMorning() {
        System.out.println(this.name + " said good morning you all from the abstract method who extends from Mom " +
                "abstract class");
    }

    @Override
    public void GoodAfternoon() {
        System.out.println(this.name + " said good afternoon ladies and gentleman from the abstract method who " +
                "extends from Mom " +
                "abstract class");
    }
}
