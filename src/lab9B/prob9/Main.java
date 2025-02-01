package lab9B.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printSquare(5);
    }

    public static void printSquare(int num) {
        IntStream.iterate(1, n -> n + 1)
                .limit(num)
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
