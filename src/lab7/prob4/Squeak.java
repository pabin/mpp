package lab7.prob4;

import lab7.prob4.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack by squeaking");
    }
}
