package oop.vehicle.car;

public class Car {

    //attributes or characteristics
    private String color; //If we don't use 'this', it will use the global attributes
    private String brand;
    private int speed;
    private int price;

    //Boolean here!
    //condition == false (turn off)
    //condition == true (turn on)
    boolean condition = false;


    //Constructor

    public Car(String color, String brand, int speed, int price) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    //Methods or actions; Added booleans
    void TurnOn() {
        if (condition == false) {
            System.out.println(this.brand + " has started the engine and is ready to go...");
            condition = true;
        } else {
            System.out.println(this.brand + " is already on!!!");
        }
    }

    void Accelerate() {
        if (condition == true) {
            System.out.println(this.brand + " is accelerating at a speed of " + this.speed + " mph");
        } else {
            System.out.println(this.brand + " can,t accelerating because the engine is off...");
        }
    }

    void Brake() {
        System.out.println(this.brand + " is braking");
    }

    void TurnOff() {
        if (condition == true) {
            System.out.println(this.brand + " has turned off its engine");
            condition = false;
        } else {
            System.out.println(this.brand + " is already off!!!");
        }
    }

}
//Creacion de objeto: TipoClase + nombreObjeto

//Crear instancia de objeto: TipoClase + nombreObjeto = new ConstructorClase();

//Acceder, modificar o ejecutar: NombreObjeto.Atributo o metodo

//Agregar boolean estado == true /false para encendido y apagado
