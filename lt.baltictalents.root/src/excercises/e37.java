package excercises;

public class e37 {
    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(hasBad(""));
        System.out.println(hasBad(null));
    }

    private static boolean hasBad(String s){
        if(s != null){
            return (s.indexOf("bad") == 0 || s.startsWith("bad", 1));
        }
        return false;
    }
}
