package lab7.prob2;

public class EquilateralTriangle implements Polygon, ClosedCurve {
    final private double sideA;
    final private double sideB;
    final private double sideC;

    public EquilateralTriangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }

    @Override
    public double computePerimeter() {
        System.out.println("in triangle");
        return sideA + sideB + sideC;
    }

    public double[] getSides() {
        double[] sides = new double[]{this.sideA, this.sideB, this.sideC};
        return sides;
    }
}
