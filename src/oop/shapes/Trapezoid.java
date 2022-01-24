package oop.shapes;

public class Trapezoid extends Shapes {
    //Attributes
    private double base;
    private double roof;
    private double height;

    //Constructor
    public Trapezoid(double base, double roof, double height) {
        this.base = base;
        this.roof = roof;
        this.height = height;
    }

    //Abstract method
    @Override
    public void Area() {
        System.out.printf("The area of trapezoid is: %.2f\n", 0.5 * (this.base + this.roof) * this.height);
    }
}
