package oop.shapes;

public class Rectangle extends Shapes {
    //Attributes
    private double width;
    private double height;

    //Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Abstract method
    @Override
    public void Area() {
        System.out.printf("The area of rectangle is: %.2f\n", this.width * this.height);
    }
}
