package lab7.prob4;

public class DecoyDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }

    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }

    @Override
    public void display() {
        System.out.println("displaying DecoyDuck");
    }
}
