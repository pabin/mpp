package lab5.prob3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle(22);
        Shape c2 = new Circle(30);
        Shape c3 = new Circle(15);

        Shape r1 = new Rectangle(20, 40);
        Shape r2 = new Rectangle(10, 50);
        Shape r3 = new Rectangle(25, 25);

        Shape t1 = new Triangle(25, 25);
        Shape t2 = new Triangle(10, 20);
        Shape t3 = new Triangle(20, 30);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.addAll(Arrays.asList(c2, c2, c3, r1, r2, r3, t1, t2, t3));

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.computeArea();
        }
        System.out.println("totalArea: " + totalArea);
    }
}
