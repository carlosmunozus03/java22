package oop.animals.cat;

public class Cat {
    //Attributes
    private String name;
    private String color;
    private String breed;
    private int age;
    private double weight;

    //Boolean Here
    //wakeup == true (wakeup)
    //wakeup == false (sleep)
    boolean wakeup = false;

    //Constructor


    public Cat(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    //Methods despertar maullar, caminar, saltar, comer, dormir
    void Wakeup() {
        if (wakeup == false) {
            System.out.println(this.name + " Wakeup");
            wakeup = true;
        } else {
            System.out.println(this.name + " is already sleeping");
        }
    }

    void Meow() {
        if (wakeup == true) {
            System.out.println("Meow Meow " + this.name + " is meowing");
        } else {
            System.out.println(this.name + " can't meowing because is sleeping");
        }
    }

    void Walk() {
        System.out.println("The cat " + this.name + " is already walking");
    }

    void Jump() {
        System.out.println("The Cat jumped");
    }

    void Eat() {
        System.out.println("The Cat is eating");
    }

    void Sleep() {
        if (wakeup == true) {
            System.out.println("The cat " + this.name + " going to sleep");
            wakeup = false;
        } else {
            System.out.println("Zzz... The cat " + this.name + " is already sleeping");
        }
    }

    //setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isWakeup() {
        return wakeup;
    }

    public void setWakeup(boolean wakeup) {
        this.wakeup = wakeup;
    }
}
