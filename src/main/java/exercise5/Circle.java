package exercise5;

public class Circle {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean contains(Point p) {
        return center.distance(p) <= radius;
    }

    public boolean isUnitCircle() {
        return radius == 1.0;
    }
}