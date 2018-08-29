package excercises;

import java.util.Arrays;

public class e31 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));
        System.out.println(Arrays.toString(makeLast(new int[]{})));
        System.out.println(Arrays.toString(makeLast(null)));
    }

    private static int[] makeLast(int[] arr) {
        if(arr == null || arr.length == 0){
            return arr;
        }
        int[] result = new int[arr.length * 2];
        for(int i = 0; i < result.length; i++){
            result[i] = 0;
            result[result.length - 1] = arr[arr.length - 1];
        }
        return result;
    }
}
