package lt.baltictalents._0829;

import lt.baltictalents._0806.ShapeUtils;

import java.util.*;
import java.util.regex.Pattern;

//TODO: tai reikia sukurti uzklausos stringa su stringbuilderiu ir isaukt pagal buildquery
//TODO: papildomi reikalavimai
public class _ndMain {
    private final static String SELECT_ALL = "SELECT * FROM ";
    private final static String WHERE = " WHERE ";
    private final static String AND = "' AND ";
    private final static String OR = "' OR ";

    public static void main(String[] args) {
        System.out.println(queryFormater(buildQuery(6, "users").toString()));
    }

    private static String queryFormater(String s){
        return s.toString().replace("{", "")
                .replace("}", "' ")
                .replace("=", "='")
                .replace(",", "'");
    }

    private static StringBuilder buildQuery(int amountOfANDS, String table) {

        StringBuilder sb = new StringBuilder();
        sb.append(SELECT_ALL);
        sb.append(table);
        sb.append(WHERE);

        int repeat = 0;

        List<String> rowNames = new ArrayList<>();
        rowNames.add("name");
        rowNames.add("lastname");
        List<String> rowValues = new ArrayList<>();
        rowValues.add("Jonas");
        rowValues.add("Petraitis");
        Map<String, String> result = new LinkedHashMap<>();

        if (amountOfANDS == 0) {
            return sb;
        }

        if (rowNames.size() == 0 || rowValues.size() == 0 || rowNames.size() == 0) {
            System.out.println("Data not found");
            return null;
        } else {
            while (repeat < amountOfANDS) {

                for (int i = 0; i < rowNames.size(); i++) {
                    result.put(rowNames.get(i), rowValues.get(i));
                    sb.append(rowNames.get(i) + "=" + rowValues.get(i));
//                    System.out.println("Mapas " + result);
                    sb.append(AND);
                    repeat++;
                }

            }
//            int countAND = 0;
//            String kazkas = "";
//            while (countAND != amountOfANDS - 1) {
//                countAND++;
//            }
//            if (countAND % 2 != 0) {
//
//            }
//            System.out.println("andai rasti " + countAND);

        }
//        System.out.println("While done");


        int length = sb.length() - 5; // panaikinamas paskutinis AND_
        sb.setLength(length);
        return sb;
    }

    private static String and2Or(StringBuilder sb) {
        return null;
    }

    private static StringBuilder oneCriteriaOnly(StringBuilder sb) {
        return null;
    }
}
