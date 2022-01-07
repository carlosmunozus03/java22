package oop.animals.dog;

public class Dog {
    //Attributes
    private String name;
    private String size;
    private String color;
    private String breed;
    private double weight;

    //Constructor


    public Dog(String name, String size, String color, String breed, double weight) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.breed = breed;
        this.weight = weight;
    }

    //Methods olfatear, ladrar, comer, caminar,saltar, dormir
    void Sniff() {
        System.out.println(this.name + " is sniffing something");
    }

    void Brake() {
        System.out.println("Guau Guau The Dog is barking");
    }

    void Eat() {
        System.out.println("The Dog is eating");
    }

    void Walk() {
        System.out.println("The Dog is already walking");
    }

    void Jump() {
        System.out.println("The Dog jumped");
    }

    void Sleep() {
        System.out.println("Zzz... The Dog is sleeping");
    }
}
