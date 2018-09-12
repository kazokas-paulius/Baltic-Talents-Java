package excercises;

public class e2 {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
        System.out.println(extraFront(""));
        System.out.println(extraFront(null));
    }

    private static String extraFront(String string) {
        if(string == null) throw new IllegalArgumentException("String cannot be null");
        if(string.isEmpty()) throw new IllegalArgumentException("String cannot be empty");
        if (string.length() > 2) {
            string = string.substring(0, 2);
        }
        return string + string + string;
    }
}
