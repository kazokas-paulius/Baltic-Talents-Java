package lt.baltictalents._0809._nd._nd1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class _nd1_Main {

    public static void main(String[] args) {
        int[] arr = new int[] {-10, 0, 2, 9, -5};

        System.out.println("Array elements: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array elements: " + Arrays.toString(arr));

        List<Integer> listArr = new LinkedList<>();

        for(int li : arr){
            listArr.add(li);
        }
        System.out.println("Int list elements: " + listArr);
        Collections.sort(listArr, Collections.reverseOrder());
        System.out.println("Int list elements in reversed order: " + listArr);
    }
}
