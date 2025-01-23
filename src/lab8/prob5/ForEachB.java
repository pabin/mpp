package lab8.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachB {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

//        list.forEach(String::toUpperCase);
//        list.forEach(System.out::println);

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
