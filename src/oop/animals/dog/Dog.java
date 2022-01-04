package oop.animals.dog;

public class Dog {
    //Attributes
    private double weight;
    private String size;
    private String color;
    private String breed;

    //Methods olfatear, ladrar, comer, caminar,saltar, dormir
    void Sniff() {
        System.out.println("The Dog is sniffing something");
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
