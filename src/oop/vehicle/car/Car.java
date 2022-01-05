package oop.vehicle.car;

public class Car {

    //attributes or characteristics
    private String color;
    private String brand;
    private int speed;
    private int price;

//Constructor

    public Car(String color, String brand, int speed, int price) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    //Methods or actions
    void TurnOn() {
        System.out.println("The Car is Turned On");
    }

    void Accelerate() {
        System.out.println("The Car is Accelerating");
    }

    void Brake() {
        System.out.println("The Car is braking");
    }

    void TurnOff() {
        System.out.println("The Car is Turned Off");
    }

}
//Creacion de objeto: TipoClase + nombreObjeto

//Crear instancia de objeto: TipoClase + nombreObjeto = new ConstructorClase();

//Acceder, modificar o ejecutar: NombreObjeto.Atributo o metodo
