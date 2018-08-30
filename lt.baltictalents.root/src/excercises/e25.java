package excercises;

import java.util.List;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class e25 {
    public static void main(String[] args) {
        System.out.println(noYY(Arrays.asList("a", "b", "c")));
        System.out.println(noYY(Arrays.asList("a", "b", "cy")));
        System.out.println(noYY(Arrays.asList("xx", "ya", "zz")));
    }

    static List<String> noYY(List<String> list){

        if(list == null) return null;
        return list.stream()
                .map(s -> s == null ? null : s.concat("y"))
                .filter(s -> s == null || !s.contains("yy"))
                .collect(toList());
    }
}
