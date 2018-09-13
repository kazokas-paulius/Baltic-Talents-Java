package lt.baltictalents._7nd.SecondND;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FileWordCounter {

    private static final String WIKI_FILE = "resources/wiki";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(WIKI_FILE);
        List<String> allWords = new ArrayList<>();

        Files.lines(path)
                .map(line -> line.trim())
                .filter(line -> line != null && !line.isEmpty())
                .map(line -> Arrays.asList(line.split("([,.;:\"'-()\\s])")))
                .forEach(list -> {
                    list.stream()
                            .map(String::trim)
                            .filter(word -> !word.isEmpty())
                            .forEach(words -> allWords.add(words));
                });
        Map<String, Long> wordMap = allWords.stream()
                .collect(groupingBy(identity(), counting()));
        wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}