package lab7.prob4;

import lab7.prob4.interfaces.FlyBehavior;
import lab7.prob4.interfaces.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all duck can do swimming");
    }

    abstract void display();
}
