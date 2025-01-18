package lab5.prob2;


import lab5.prob2.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking by Quack");
    }
}
