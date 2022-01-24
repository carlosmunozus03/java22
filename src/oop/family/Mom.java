package oop.family;

public abstract class Mom {
    //Attributes
    private String name;

    //Constructor
    public Mom(String name) {
        this.name = name;
    }

    //Empty constructor
    public Mom() {

    }

    //Methods
    public void Walk() {
        System.out.println(this.name + " is walking on the street");
    }

    //Abstract Methods (Declaration)
    public abstract void GoodMorning();

    public abstract void GoodAfternoon();
}
//Clase abstracta funciona igual que herencia pero obliga a sobreescribir los metodos especificados
//Puede tener atributos privados, metodos abstractos y metodos "normales"
//nNo puede implementar interfaces
