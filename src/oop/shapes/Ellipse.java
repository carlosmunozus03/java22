package oop.shapes;

public class Ellipse extends Shapes {
    //Attributes
    private static final double pi = 3.1416;
    private double side_a;
    private double side_b;

    //Constructor

    public Ellipse(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public void Area() {
        System.out.printf("The area of ellipse is: %.2f\n", this.pi * this.side_a * this.side_b);
    }
}
