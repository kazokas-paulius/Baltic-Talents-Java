package excercises;

import java.util.List;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class e23 {
    public static void main(String[] args) {
        System.out.println(noX(Arrays.asList("ax", "bb", "cx")));
        System.out.println(noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
        System.out.println(noX(Arrays.asList("x")));
    }

    private static List<String> noX(List<String> list){
        return list.stream().map(s -> s.replace("x", "")).collect(toList());
    }
}
