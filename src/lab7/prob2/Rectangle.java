package lab7.prob2;

public final class Rectangle implements Polygon {
    final private double width;
    final private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double[] getSides() {
        double[] sides = new double[]{this.width, this.length};
        return sides;
    }

}
