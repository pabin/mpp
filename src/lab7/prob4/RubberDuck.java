package lab7.prob4;

public class RubberDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }

    @Override
    public void display() {
        System.out.println("displaying RubberDuck");
    }
}
