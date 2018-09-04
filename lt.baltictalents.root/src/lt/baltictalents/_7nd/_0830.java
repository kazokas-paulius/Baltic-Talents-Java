package lt.baltictalents._7nd;

//        Duota /demo/19/automobilis?id=140
//        Pasitikrinimui pasinaudokite https://regex101.com/
//        1. rasti tekstą nuo pradžios iki ? (/demo/19/automobilis)
//        2. raskite tekstą nuo ? iki galo (id=140)
//        3. raskite tekstą iki antro / (/demo)
//        4. raskite tekstą tarp paskutinio / ir ? (automobilis)

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _0830 {

    public static String theString = "/demo/19/automobilis?id=140";

    public static void main(String[] args) {
        thirtyOne("[^=]*?(?=\\?)",theString); // [^=]*?(?=\?)
        thirtyOne("([^?]*?(?=\\w\\d{2})...)",theString); // ([^?]*?(?=\w\d{2})...)
        thirtyOne("[^\\d]+?(?=\\/)",theString); // [^\d]+?(?=\/)
        thirtyOne("[^\\/]+?(?=\\?)",theString); // [^\/]+?(?=\?)
    }

    private static void thirtyOne(String theRegex, String s){
        Pattern p = Pattern.compile(theRegex);
        Matcher m = p.matcher(s);
        while(m.find()){
            if(m.group().length() != 0){
                System.out.println(m.group().trim());
            }
        }
    }
}
