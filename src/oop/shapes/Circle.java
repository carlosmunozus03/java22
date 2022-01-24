package oop.shapes;

public class Circle extends Shapes {
    //Attributes
    private static final double pi = 3.1416;
    private double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Abstract method
    @Override
    public void Area() {
        System.out.printf("The area of the circle is: %.2f\n", this.pi * (this.radius * this.radius));
    }
}
