package lab7.prob2;

public interface Polygon extends ClosedCurve {
    default double computePerimeter() {
        double perimeter = 0;
        for (double s : getSides()) {
            perimeter += s;
        }
        return perimeter;
    }

    double[] getSides();
}
