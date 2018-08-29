package excercises;

public class e33 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));
    }

    private static boolean love6(int a, int b){
        if(a == 6 || b == 6) return true;
        if(Math.abs(a + b) == 6) return true;
        if(Math.abs(a - b) == 6) return true;
        return false;
    }

    // sitaip nedaryti, ne pagal salyga :)
    private static boolean love6(int... arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
            if(i == 6 || sum == 6){
                return true;
            }
        }
        return false;
    }
}
