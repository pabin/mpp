package lab9B.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printSquare(9);
    }

    public static void printSquare(int num) {
        IntStream.iterate(1, n -> n * 2)
                .limit(num)
                .forEach(System.out::println);
    }
}
