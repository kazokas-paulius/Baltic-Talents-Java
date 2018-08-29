package excercises;

public class e8 {
    public static void main(String[] args) {
        System.out.println(unlucky(1, 3, 4, 5));
        System.out.println(unlucky(2, 1, 3, 4, 5));
        System.out.println(unlucky(1, 1, 1));
    }
    private static boolean unlucky(int... integers){
        if(integers == null || integers.length < 2){
            return false;
        }
        if (integers[0] == 1 && integers[1] == 3 ||
                integers[1] == 1 && integers[2] == 3 ||
                integers[integers.length - 2] == 1 && integers[integers.length - 1] == 3){
            return true;
        }
        return false;
    }
}
