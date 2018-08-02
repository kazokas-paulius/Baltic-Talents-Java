package lt.baltictalents._0731;

public class ndBONUS_Main {
    public static void main(String[] args){
        int min = 1; int max = 1000;
        for(min = 1; min <= max; min++){
            int sum = 0;
            for(int j = 1; j < min; j++){ // forins range didinant min reiksme (min 10 tada forins iki 10)
                if((min % j) == 0){
                    sum += j;
                }
            }
            if(sum == min)
                System.out.print(sum + " ");
        }
    }
}
