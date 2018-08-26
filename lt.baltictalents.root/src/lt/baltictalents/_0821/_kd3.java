package lt.baltictalents._0821;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _kd3 {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        int aSuma = 0; int bSuma = 0;

        aSuma += Stream.of(5, 6, 10, 15, 8, 4).mapToInt(x -> x).sum();
        bSuma += Stream.of(8, 5, 3).mapToInt(y -> y).sum();

        double avg1 = IntStream.of(a).average().getAsDouble();
        double avg2 = IntStream.of(b).average().getAsDouble();
        System.out.println(String.format("%.2f",avg1 - avg2));
    }
}
