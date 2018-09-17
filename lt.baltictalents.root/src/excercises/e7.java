package excercises;

import java.util.Arrays;

public class e7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusTwo(new int[]{1, 2}, new int[]{3, 4, 7, 9, 1, 3})));
        System.out.println(Arrays.toString(plusTwo(new int[]{4}, new int[]{2, 2, 5})));
        System.out.println(Arrays.toString(plusTwo(new int[]{9, 2, 1, 8}, new int[]{3, 4})));
        System.out.println(Arrays.toString(plusTwo(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(plusTwo(null, new int[]{8, 9})));
        System.out.println(Arrays.toString(plusTwo(new int[]{1, 4}, null)));
        System.out.println(Arrays.toString(plusTwo(null, null)));
    }

    static int[] plusTwo(int[] arr1, int[] arr2) {
        try {
            int[] result = new int[arr1.length + arr2.length];

            if (arr1.length == 0) {
                if (arr2.length == 0) {
                    return result;
                } else {
                    for (int i = 0; i < arr2.length; i++) {
                        result[i] = arr2[i];
                    }
                }
            } else {
                for (int j = 0; j < arr1.length; j++) {
                    result[j] = arr1[j];
                }
            }

            // adds first arrays elements
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i];
            }

            // adds second arrays elements
            int offset = arr1.length;
            for (int j = 0; j < arr2.length; j++) {
                result[offset + j] = arr2[j];
            }

            return result;

        }
        // if somewhere is null
        catch (NullPointerException e) {
            int[] result = null;
            if (arr1 == null && arr2 == null) {
                return result;
            }
            if (arr1 == null) {
                int[] result2 = new int[arr2.length];
                if (arr2 != null) {
                    for (int i = 0; i < arr2.length; i++) {
                        result2[i] = arr2[i];
                    }
                }
                return result2;
            }
            if (arr1 != null) {
                int[] result1 = new int[arr1.length];
                if (arr2 == null) {
                    for (int j = 0; j < arr1.length; j++) {
                        result1[j] = arr1[j];
                    }
                }
                return result1;
            }
            return result;
        }
    }
}
