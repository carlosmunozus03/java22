package oop.animals.cat;

public class Cat {
    //Attributes
    private String name;
    private String color;
    private String breed;
    private int age;
    private double weight;

    //Constructor


    public Cat(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        age = age;
        this.weight = weight;
    }

    //Methods maullar, caminar, saltar, comer, dormir
    void Meow() {
        System.out.println("Meow Meow " + this.name + " is meowing");
    }

    void Walk() {
        System.out.println("The Cat is already walking");
    }

    void Jump() {
        System.out.println("The Cat jumped");
    }

    void Eat() {
        System.out.println("The Cat is eating");
    }

    void Sleep() {
        System.out.println("Zzz... The Cat is already sleeping");
    }
}
