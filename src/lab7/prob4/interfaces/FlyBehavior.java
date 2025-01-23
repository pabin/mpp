package lab7.prob4.interfaces;

public interface FlyBehavior {
    default void fly() {
        System.out.println("def: flying with wings");
    }
}
