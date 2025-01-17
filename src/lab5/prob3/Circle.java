package lab5.prob3;

public class Circle implements Shape {
    private double radius;

    Circle(double r) {
        this.radius = r;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
