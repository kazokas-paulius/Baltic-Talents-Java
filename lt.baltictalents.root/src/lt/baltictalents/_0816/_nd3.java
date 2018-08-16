package lt.baltictalents._0816;

public class _nd3 {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        int aSuma = 0; int bSuma = 0;
        int abDiff = 0;

        for(int i:a){
            aSuma += i;
        }
        for(int j:b){
            bSuma += j;
        }

        abDiff = aSuma - bSuma;

        System.out.println("A masyvo suma: " + aSuma);
        System.out.println("B masyvo suma: " + bSuma);
        System.out.println("Masyvu skirtumas: " + abDiff);
    }
}
