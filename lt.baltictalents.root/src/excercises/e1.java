package excercises;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class e1 {
    public static void main(String[] args) {
        System.out.println(dubling(Arrays.asList(1, 2, 3)));
        System.out.println(dubling(Arrays.asList(6, 8, 6, 8, -1)));
        System.out.println(dubling(Collections.emptyList()));
    }
    static List<Integer> dubling(List<Integer> items){
        if(items == null) return null;
        return items.stream().map(i -> i * 2).collect(toList());
    }
}
