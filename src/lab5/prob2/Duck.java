package lab5.prob2;

public class Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void quack() {
        System.out.println("quacking");
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void display() {
        System.out.println("displaying");
    }
}
