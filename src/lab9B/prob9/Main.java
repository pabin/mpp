package lab9B.prob9;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        printSquare(4);
    }

    public static void printSquare(int num) {
//        Supplier<Integer> supp = (1) -> 1;

        IntStream.iterate(1, n -> n < 100, n -> n * n)
                .limit(10)
                .forEach(System.out::println);

//        Stream.generate(() -> 2 * 2)
//                .limit(5).forEach(System.out::println);


    }
}
