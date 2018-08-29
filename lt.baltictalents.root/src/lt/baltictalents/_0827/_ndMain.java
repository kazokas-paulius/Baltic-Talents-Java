package lt.baltictalents._0827;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _ndMain {
    public static void main(String[] args) throws IOException {

        Path p = Paths.get("C:\\Users\\pauli\\OneDrive\\Desktop\\Kraken\\JAVA\\Baltic-Talents-Java\\lt.baltictalents.root\\src\\lt\\baltictalents\\_0827\\failas");
        Files.lines(p).map(l -> l.trim().split("[\\s]*,[\\s]*"))
                .forEach(arr -> {
                    for (String s : arr) {
                        System.out.println(s);
                    }
                });
    }
}
