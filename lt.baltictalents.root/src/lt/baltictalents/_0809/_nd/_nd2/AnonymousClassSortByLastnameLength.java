package lt.baltictalents._0809._nd._nd2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class AnonymousClassSortByLastnameLength {
    public static void main(String[] args) {
        List<Owner> oList = new ArrayList<>();

        oList.add(new Owner("Carl", "Malone"));
        oList.add(new Owner("Elizabeth", "Vroughelson"));
        oList.add(new Owner("Caroline", "Green"));
        oList.add(new Owner("Tom", "Edison"));
        oList.add(new Owner("Simone", "Wherlsenson"));

        Collections.sort(oList, new Comparator<Owner>() {
            @Override
            public int compare(Owner own1, Owner own2) {
                return own1.getLastName().length() - own2.getLastName().length();
            }
        });

        System.out.println(oList);
    }
}
