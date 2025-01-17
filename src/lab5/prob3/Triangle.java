package lab5.prob3;

public class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    public double computeArea() {
        return (base * height) / 2;
    }
}
