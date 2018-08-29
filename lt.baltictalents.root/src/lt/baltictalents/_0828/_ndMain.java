package lt.baltictalents._0828;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class _ndMain {
    public static void main(String[] args) throws IOException {
        List<String> foodContent = Arrays.asList("Pizza", "Spaghetti");
        Path pF = Paths.get("food.txt");
        Files.write(pF, foodContent);

        List<String> drinksContent = Arrays.asList("Beer", "Gin");
        Path pD = Paths.get("drink.txt");
        Files.write(pD, drinksContent);

        BufferedReader brF = new BufferedReader(new FileReader("food.txt"));
        BufferedReader brD = new BufferedReader(new FileReader("drink.txt"));
        String fData, dData;
        List<String> fList = new ArrayList<>();
        List<String> dList = new ArrayList<>();
        while((fData = brF.readLine()) != null){
            fList.add(fData);
        }
        System.out.println();

        Path pM = Paths.get("menu.txt");
//        Files.write(pM,)
    }
}
