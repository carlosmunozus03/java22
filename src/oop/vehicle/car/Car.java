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

    void Color() {
        System.out.println(this.brand + " is " + this.color);
    }

    //setter and getters here


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
//Creacion de objeto: TipoClase + nombreObjeto

//Crear instancia de objeto: TipoClase + nombreObjeto = new ConstructorClase();

//Acceder, modificar o ejecutar: NombreObjeto.Atributo o metodo

//Agregar boolean estado == true /false para encendido y apagado

//Agregar setter and getters al final para manipular informacion de atributos privados (Encapsulacion)

//4 Pilares de oop Encapsulacion-Abtraccion-polimorfismo-herencia
