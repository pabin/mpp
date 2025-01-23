package lab7.prob4;

import lab7.prob4.interfaces.FlyBehavior;
import lab7.prob4.interfaces.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior {
    public void swim() {
        System.out.println("all duck can do swimming");
    }

    abstract void display();
}
