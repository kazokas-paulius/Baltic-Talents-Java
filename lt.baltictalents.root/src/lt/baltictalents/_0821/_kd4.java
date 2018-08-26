package lt.baltictalents._0821;

import java.util.HashSet;
import java.util.Set;

public class _kd4 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("ABC");s.add("defg");
        s.add("HiJk");s.add("123456");
        s.add("l7m81uH");s.add("9n10");
        s.add("O0p1");s.add("2R");
        s.add("45U");s.add("VZ670o");

        s.forEach(x -> System.out.print(x + " - " + x.length() + "; "));
        System.out.println();
        s.stream().map(x -> x + " - " + x.length() + "; ").forEach(System.out::println);
    }
}
