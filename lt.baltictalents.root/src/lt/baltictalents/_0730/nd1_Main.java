package lt.baltictalents._0730;
// Susumuoti pirmus (mažiausius) penkis nelyginius skaičius iš intervalo [1; 100].
public class nd1_Main {
    public static void main(String[] args){
        int count = 0; int total = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                count++;
                total += i;
                System.out.print(i + " ");
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("| Suma: " + total);
    }
}