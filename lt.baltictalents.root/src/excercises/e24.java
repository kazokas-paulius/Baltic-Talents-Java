package excercises;

import java.util.List;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class e24 {
    public static void main(String[] args) {
        System.out.println(noNeg(Arrays.asList(1, -2)));
        System.out.println(noNeg(Arrays.asList(-3, -3, 3, 3)));
        System.out.println(noNeg(Arrays.asList(-1, -1, -1)));
    }

    static List<Integer> noNeg(List<Integer> strings) {
        if(strings == null){
            return null;
        }
        return strings.stream().filter(i -> i >= 0).collect(toList());
    }
}
