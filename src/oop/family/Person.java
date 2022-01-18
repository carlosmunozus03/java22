package oop.family;

public class Person {
    //Attributes
    private String name;
    private String email;
    private int age;
    boolean sleep = true; // wakeup = false

    //Constructor


    public Person(String name, String email, int age, boolean sleep) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.sleep = sleep;
    }

    //Methods
    public void Wakeup() {
        if (sleep == true) {
            System.out.println("The " + this.name + " is wakeup!!!");
            sleep = false;
        } else {
            System.out.println("The " + this.name + " is already wakeup...");
        }
    }

    public void Sleep() {
        if (sleep == false) {
            System.out.println("The " + this.name + " is sleep");
            sleep = true;

        } else {
            System.out.println("The " + this.name + " is already sleeping");
        }
    }
    //Setters and Getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }
}
