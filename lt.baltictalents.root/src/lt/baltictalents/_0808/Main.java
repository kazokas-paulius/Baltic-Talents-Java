package lt.baltictalents._0808;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<String> setkazkas = new TreeSet<>();
        setkazkas.add("1");
        setkazkas.add("2");
        setkazkas.add("3");
        setkazkas.add("4");
        setkazkas.add("5");
        setkazkas.add("6");
        setkazkas.add("7");
        setkazkas.add("8");
        setkazkas.add("9");
        setkazkas.add("10");

        System.out.println(setkazkas);

        Set<Integer> intkazkas = new TreeSet<>();
        for(String s : setkazkas){
            intkazkas.add(Integer.valueOf(s));
        }

        System.out.println(intkazkas);
        System.out.println();
        List<Integer> intListkazkas = new ArrayList<>(intkazkas);
        intListkazkas.remove(intListkazkas.size() - 1);
        intListkazkas.remove(intListkazkas.size() / 2);
        Collections.shuffle(intListkazkas);
        System.out.println("Reiksmes " + intListkazkas);

        Set<String> setkazkas2 = new HashSet<>(setkazkas);
        List<String> setListkazkas2 = new ArrayList<>(setkazkas2);
        Collections.shuffle(setListkazkas2);

        System.out.println("Raktai " + setListkazkas2);

        Map<String, Integer> mapkazkas = new HashMap<>();
        int size = intListkazkas.size();
        int index = 0;
        for(String k : setListkazkas2){
//            if(size == index){
//                break;
//            }
            mapkazkas.put(k, index >= size ? null : intListkazkas.get(index));
            index++;
        }

        System.out.println("Mapas " + mapkazkas);
    }
}
