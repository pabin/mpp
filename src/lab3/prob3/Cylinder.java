package lab3.prob3;

public class Cylinder {
    private double height;
    private double radius;

    Cylinder(double h, double r) {
        this.height = h;
        this.radius = r;
    }

    public double computeVolume() {
        return (Math.PI * this.radius * this.radius) / this.height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }
}
