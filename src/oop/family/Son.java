package oop.family;

public class Son implements Dad {
    //Attributes
    private String name;

    //Constructor
    public Son(String name) {
        this.name = name;
    }

    //Method
    @Override
    public void Hello() {
        System.out.println("Hey this is " + this.name + " the Son class who implements the Dad interface!!!");
    }

    @Override
    public void Goodbye() {
        System.out.println(this.name + " said Goodbye from the Son class who implements the Interface call Dad");
    }
}
//Obliga a sobreescribir los metodos especificados desde la interface
