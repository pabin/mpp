package lab5.prob2;


import lab5.prob2.interfaces.FlyBehavior;

public class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}