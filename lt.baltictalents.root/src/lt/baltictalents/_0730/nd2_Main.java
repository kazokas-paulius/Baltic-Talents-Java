package lt.baltictalents._0730;
// Susumuoti paskutinius (didžiausius) tris skaičius iš intervalo [1; 100].
public class nd2_Main {
    public static void main(String[] args){
        int count = 0; int total = 0;
        for (int i = 100; i >= 1; i--){
            System.out.println(i + " ");
            if (count < 3){
                count++;
                total += i;
            }
        }
        System.out.println("Suma: " + total);
    }
}
