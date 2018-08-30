package excercises;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

//TODO: Loop over the given array of strings to build a result string like this: when a string appears the 2th, 4th, 6th, etc. time in the array, append the string to the result. Retur the empty string if no string appears a 2th time.

public class e36 {
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }

    static String wordAppend(String[] strings) {
        if (strings == null) {
            return "";
        }
        long count = Arrays.stream(strings).filter(s -> s != null && s.equals("a")).count() / 2;
//        String str = "";
//        for(int i = 0; i < count; i++){
//            str += "a";
//        }
//        return str;
        return Stream.generate(() -> "a").limit(count).collect(joining());
    }
}
