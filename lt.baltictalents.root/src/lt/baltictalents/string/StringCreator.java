package lt.baltictalents.string;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class StringCreator {
    private static final String EMPTY = "empty";
    private static final String NULL = "null";
    private static final String STRING_SIZE_ERROR = "there should be at least 2 strings";
    private static final String STRING_EMPTYSIZE_ERROR = "there should be at least 2 strings";

    public static void main(String[] args) {
        System.out.println("2 String parametrai" + "\n");
        System.out.println(create("Pranas", "Storžievis"));
        System.out.println(create("", ""));
        System.out.println(create("", null));
        System.out.println(create(null, null));
        System.out.println("\n" + "Daugiau negu 2 parametrai" + "\n");
        System.out.println(create(new String[]{"Obuolys", "Ananasas", "Apelsinas"}));
        System.out.println(create(new String[]{"Obuolys", "Ananasas"}));
        System.out.println(create(new String[]{"", "", ""}));
        System.out.println(create(new String[]{}));
//        System.out.println(create(new String[]{null, null, null}));
        System.out.println(create(null));
    }

    static String create(String s1, String s2) {
        if (s1 == null) s1 = NULL;
        if (s2 == null) s2 = NULL;
        if (s1.isEmpty()) s1 = EMPTY;
        if (s2.isEmpty()) s2 = EMPTY;
        return s1.concat(s2);
    }

    static String create(String[] strings) {
        String result = "";
        if (strings == null) return NULL;
        if(strings.length < 2) return STRING_SIZE_ERROR;
//        if(strings.length == 0) return STRING_EMPTYSIZE_ERROR;
        for (String s : strings) {
            if (s.isEmpty()) s = EMPTY;
            if (s.equals(null)) s = NULL;
            result = result.concat(s);
        }
        return result;
    }
}
