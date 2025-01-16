package lab3.prob3.prob3b;

public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle(40);
        System.out.println(circle.computeArea());

        Cylinder cylinder = new Cylinder(30, 50);
        System.out.println(cylinder.computeVolume());
    }
}
