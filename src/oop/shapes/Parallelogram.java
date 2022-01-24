package oop.shapes;

public class Parallelogram extends Shapes {
    //Attributes
    private double base;
    private double height;

    //Constructor
    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Abstract method
    @Override
    public void Area() {
        System.out.printf("The area of parallelogram is: %.2f\n", this.base * this.height);
    }
}
