package lab3.prob3;

public class Circle extends Cylinder {

    Circle(double radius) {
        super(0.0, radius);
    }

    public double computeArea() {
        double radius = this.getRadius();
        return (Math.PI * radius * radius);
    }
}
