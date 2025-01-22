package lab7.prob4;


import lab7.prob4.interfaces.FlyBehavior;

public class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}