package lt.baltictalents._0813;

public class kd_1 {
    public static void main(String[] args) {
        int count = 0; int suma = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                count++;
                suma += i;
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("Suma: " + suma);
    }
}
