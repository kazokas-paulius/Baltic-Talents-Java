package lt.baltictalents._7nd;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class _0831 {
    public final static String PATH = "resources/wiki";
    public static File wikiFile = new File(PATH);

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File(PATH));
        List<String> list = new ArrayList<>();

        while (sc.hasNext()) {
            list.add(sc.next());
        }

        sc.close();

        String[] stArr = new String[list.size()];

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            stArr[i] = list.get(i).replaceAll("([,.;:\"'-()\\s])", "");
        }

        for (int i = 0; i < stArr.length; i++) {
            int cunt = 1;
            for(int j =0; j < stArr.length; j++){
                String newWord = stArr[i].toLowerCase();
                if(newWord.compareToIgnoreCase(stArr[j]) == 0){
                    map.put(newWord, cunt++);
                }
            }
        }

        Map<String, Integer> sortedByQuatiti = sortByValue(map);

        for(Map.Entry<String, Integer> entry : sortedByQuatiti.entrySet()){
            System.out.println("\"" + entry.getKey() + "\"" + " used: " + entry.getValue() + " times.");
        }

        wordCounter();
    }

    private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {   // Isidedam metoda kuris komparuoja mapa pagal reiksmes.
        List<Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Comparable<V>) ((Map.Entry<K, V>) (o2)).getValue())
                        .compareTo(((Map.Entry<K, V>) (o1)).getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Iterator<Entry<K, V>> it = list.iterator(); it.hasNext();) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) it.next();
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    private static void wordCounter() {
        try (Scanner sc = new Scanner(new FileInputStream(wikiFile))) {
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
