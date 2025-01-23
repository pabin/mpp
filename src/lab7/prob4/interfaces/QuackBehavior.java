package lab7.prob4.interfaces;

public interface QuackBehavior {
    default void quack() {
        System.out.println("def: quacking by quack");
    }
}
