package lab5.prob2;

import lab5.prob2.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack by squeaking");
    }
}
