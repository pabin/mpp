package lab5.prob3;

public class Rectangle implements Shape {
    private double width;
    private double length;

    Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}
