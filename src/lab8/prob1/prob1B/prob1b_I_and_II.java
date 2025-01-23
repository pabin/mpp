package lab8.prob1.prob1B;

import java.util.function.Supplier;

public class prob1b_I_and_II {
    public static void main(String[] args) {
        /*
            Questions: 1b.I
            Math::random

            equivalent lambda expression is:
            () -> Math.random()

         */

        // Questions 1b.II
        Supplier<Double> mylambda = () -> Math.random();
        System.out.println(mylambda.get());
    }

}
