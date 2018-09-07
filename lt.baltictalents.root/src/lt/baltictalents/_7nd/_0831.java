package lt.baltictalents._7nd;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class _0831 {
    private final static String PATH = "resources/wiki";
    private static File wikiFile = new File(PATH);

    public static void main(String[] args) throws IOException {
        wordPopulation();
    }

    private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {   // Isidedam metoda kuris komparuoja mapa pagal reiksmes.
        List<Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {
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
        try (Scanner scanner = new Scanner(new FileInputStream(wikiFile))) {
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void wordPopulation() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(PATH));
        List<String> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.next());
        }

        scanner.close();

        String[] stringArray = new String[list.size()];

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            stringArray[i] = list.get(i).replaceAll("([,.;:\"'-()\\s])", "");
        }

        for (int i = 0; i < stringArray.length; i++) {
            int count = 1;
            for(int j =0; j < stringArray.length; j++){
                String newWord = stringArray[i].toLowerCase();
                if(newWord.compareToIgnoreCase(stringArray[j]) == 0){
                    map.put(newWord, count++);
                }
            }
        }

        Map<String, Integer> sortedByQuatity = sortByValue(map);

        for(Map.Entry<String, Integer> entry : sortedByQuatity.entrySet()){
            System.out.println("\"" + entry.getKey() + "\"" + " used: " + entry.getValue() + " times.");
        }

        wordCounter();
    }

}
