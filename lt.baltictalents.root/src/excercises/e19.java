package excercises;

import java.util.List;
import java.util.Arrays;
import static java.util.stream.Collectors.toList;

public class e19 {
    public static void main(String[] args) {
        System.out.println(copies3(Arrays.asList("a", "bb", "ccc")));
        System.out.println(copies3(Arrays.asList("24", "a", "")));
        System.out.println(copies3(Arrays.asList("hello", "there")));
    }
    private static List<String> copies3(List<String> list){
        return list.stream().map(i -> i + i.concat(i)).collect(toList());
//        return list.stream().map(i -> i.concat(i).concat(i)).collect(toList());
    }
}
