package oop.shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Square square = new Square(3.7);
        square.Area();

        Triangle triangle = new Triangle(3.2, 5.7);
        triangle.Area();

        Circle circle = new Circle(5);
        circle.Area();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.Area();

        Parallelogram parallelogram = new Parallelogram(1.5, 3);
        parallelogram.Area();

        Trapezoid trapezoid = new Trapezoid(3, 2, 3);
        trapezoid.Area();

        Ellipse ellipse = new Ellipse(2, 2);
        ellipse.Area();
    }
}
