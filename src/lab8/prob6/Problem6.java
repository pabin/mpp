package lab8.prob6;

import java.util.function.Consumer;

public class Problem6 {
    public static void main(String[] args) {
        Consumer<String> toupper = (x) -> System.out.println(x.toUpperCase());
        toupper.accept("capital");

        Consumer<String> toupper2 = String::toUpperCase;
        toupper2.accept("united");
    }
}
