package lab11.prob2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 6, 8, 3, 5);
        List<Double> list2 = Arrays.asList(2.5, 6.1, 8.0, 3.4, 5.2);
        List<String> list3 = Arrays.asList("bill", "bob", "jim", "tom");
        Group group1 = new Group(8, list1);
        Group group2 = new Group(6.1, list2);
        Group group3 = new Group("tom", list3);
        System.out.println("group1: " + group1);
        System.out.println("group2: " + group2);
        System.out.println("group3: " + group3);

        System.out.println();
        Group copied1 = Group.copy(group1);
        Group copied2 = Group.copy(group2);
        Group copied3 = Group.copy(group3);
        System.out.println("copied1: " + copied1);
        System.out.println("copied2: " + copied2);
        System.out.println("copied3: " + copied3);

        System.out.println("----");


        List<Integer> arr = Arrays.asList(9, 0, 2, 7, 8);

        Stream<Integer> stream = arr.stream();
        System.out.println(stream);
    }
}
