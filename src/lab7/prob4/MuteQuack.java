package lab7.prob4;

import lab7.prob4.interfaces.QuackBehavior;


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
