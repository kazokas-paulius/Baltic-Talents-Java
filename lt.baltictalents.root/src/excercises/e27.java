package excercises;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class e27 {
    public static void main(String[] args) {
        System.out.println(noTeen(Arrays.asList(12, 13, 19, 20)));
        System.out.println(noTeen(Arrays.asList(1, 14, 1)));
        System.out.println(noTeen(Collections.singletonList(15)));
        System.out.println(noTeen(Collections.emptyList()));
        System.out.println(noTeen(null));
    }

    private static List<Integer> noTeen(List<Integer> list) {
        if (list == null) return null;
        return list.stream().filter(i -> i < 13 || i > 19).collect(toList());
    }
}
