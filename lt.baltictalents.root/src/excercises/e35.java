package excercises;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

// TODO: OUTPUT {s=saltsoda, t=teatoast} {a=aaaAA, b=bb, c=cccCC, d=d} {a=aAA, b=bb, c=cccCC, d=d}
// TODO: OUTPUT {a=AbCaAA, b=bbBbC, c=cccCC, d=d} {} null
public class e35 {
    public static void main(String[] args) {
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{null, "bb", null, "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{"AbC", "bb", "BbC", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{}));
        System.out.println(firstChar(null));
    }

    private static Map<String, String> firstChar(String[] strings) {
        if (strings == null) return null;
        Map<String, String> result = new HashMap<>();
        List<String> stringList = Arrays.stream(strings).filter(d -> d != null).collect(toList());
        stringList.stream()
                .map(s -> String.valueOf(s.charAt(0)).toLowerCase())
                .collect(toSet())
                .forEach(c -> result.put(c,
                        stringList.stream()
                                .filter(t -> t.toLowerCase().startsWith(c))
                                .collect(Collectors.joining())));
        return result;
    }
}