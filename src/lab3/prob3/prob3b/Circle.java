package lab3.prob3.prob3b;

public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return (Math.PI * radius * radius);
    }
}
