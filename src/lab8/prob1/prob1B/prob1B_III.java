package lab8.prob1.prob1B;

import java.util.function.Supplier;

public class prob1B_III {
    public static void main(String[] args) {
        RandomSupplier randomSupplier = new RandomSupplier();
        double randomNumber = randomSupplier.get();
        System.out.println("Random Number: " + randomNumber);
    }

    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

}
