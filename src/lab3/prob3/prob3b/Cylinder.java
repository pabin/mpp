package lab3.prob3.prob3b;

public class Cylinder {
    private Circle circle;
    private double height;

    Cylinder(double h, double r) {
        this.height = h;
        this.circle = new Circle(r);
    }

    public double computeVolume() {
        return (circle.computeArea()) / this.height;
    }

    public double getHeight() {
        return this.height;
    }

    public Circle getCircle() {
        return this.circle;
    }
}

