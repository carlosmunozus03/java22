package oop.shapes;

public class Square extends Shapes {
    //Attribute
    private double side;

    //Constructor
    public Square(double side) {
        this.side = side;
    }

    //Abstract Method
    @Override
    public void Area() {
        System.out.printf("The area of square is: %.2f\n", this.side * this.side);
    }
}
