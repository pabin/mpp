package lab5.prob2;

public class ReadheadDuck extends Duck {
    public ReadheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("displaying redhead");
    }
}
