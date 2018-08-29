package excercises;

public class e4 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    private static String middleThree(String s){
        String middle = s.substring((s.length() / 2) -1, (s.length() / 2) + 2);
        return middle;
    }
}
