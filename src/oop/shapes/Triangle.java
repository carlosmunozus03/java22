package oop.shapes;

public class Triangle extends Shapes {
    //Attributes
    private double base;
    private double height;

    //Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Abstract method
    @Override
    public void Area() {
        System.out.printf("The area of triangle is: %.2f\n", (this.base * 0.5) * this.height);
    }
}
