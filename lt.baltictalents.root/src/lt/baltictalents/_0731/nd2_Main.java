package lt.baltictalents._0731;

public class nd2_Main {
    public static void main(String[] args){
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        int sumA = 0; int sumB = 0;
        double avgA = 0.0; double avgB = 0.0;
        double diff = 0.0;

        for(int i : a){
            sumA += i;
        }
        avgA = sumA / a.length;

        for(int j : b){
            sumB += j;
        }
        avgB = sumB / b.length;

        if(avgA > avgB){
            diff = avgA - avgB;
            System.out.println("avgA is higher");
        }else{
            diff = avgB - avgA;
            System.out.println("avgB is higher");
        }

        System.out.print(diff);
    }
}
