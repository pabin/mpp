package lab5.prob2;

import lab5.prob2.interfaces.QuackBehavior;


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
