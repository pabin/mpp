package lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(0, 3, -2, 1, 6, 8, 9, 4);
        List<Double> list2 = Arrays.asList(3.2, 3.3, 1.2, 6.5, 8.1, 4.0);

        int res1 = secondSmallest(list1);
        double res2 = secondSmallest(list2);
        System.out.println(res1);
        System.out.println(res2);
    }

    public static <T extends Comparable> T secondSmallest(List<T> list) {
        if (list.size() < 2) return list.get(0);
        T smallest = list.get(0);
        T secSmallest = list.get(1);

        for (T item : list) {
            if (item.compareTo(smallest) < 0) {
                secSmallest = smallest;
                smallest = item;
            }
            if (item.compareTo(secSmallest) < 0 && item.compareTo(smallest) > 0) {
                secSmallest = item;
            }
        }
        return secSmallest;
    }

    public static Integer secondSmallestNonGeneric(List<Integer> list) {
        if (list.size() < 2) return list.get(0);
        int small1 = list.get(0);
        int small2 = list.get(1);
        int smallest = Math.min(small1, small2);
        int secSmallest = Math.max(small1, small2);

        for (int i = 2; i < list.size(); i++) {
            int current = list.get(i);
            if (current < smallest) {
                secSmallest = smallest;
                smallest = current;
            }
            if (current < secSmallest && current > smallest) {
                secSmallest = current;
            }
        }
        return secSmallest;
    }
}
