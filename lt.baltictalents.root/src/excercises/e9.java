package excercises;

//TODO: Given a list of integers, return a list where each integer is multiplied with itself

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class e9 {
    public static void main(String[] args) {
        System.out.println(square(Arrays.asList(1, 2, 3)));
        System.out.println(square(Arrays.asList(6, 8, -6, -8, 1)));
        System.out.println(square(Arrays.asList()));
    }

    private static List<Integer> square(List<Integer> list){

        return list.stream().map(i -> (i * i)).collect(toList());
    }
}
