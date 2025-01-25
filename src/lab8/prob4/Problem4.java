package lab8.prob4;

import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("world", "german", "editor", "asians", "everest", "school");
        int res = countWords(list, 'a', 'o', 6);
        System.out.println(res);
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        List<String> filtered = words.stream()
                .filter(x -> x.length() == len)
                .filter(x -> x.contains(String.valueOf(c)))
                .filter(x -> !x.contains(String.valueOf(d)))
                .toList();

        return filtered.size();
    }
}
