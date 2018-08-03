package lt.baltictalents._0802;

import java.util.Arrays;

public class Main extends secMain{
    public static void main(String[] args){

        int[] intArray = new int[] {14, 16, 43, 45};

        secMain sm = new secMain();

        System.out.println("Seimos dydis: " + sm.setElemArray(intArray) + ".");


        System.out.println("Vyriausio asmens amzius: " + sm.setAge(intArray) + ".");
        System.out.println("Amziaus vidurkis: " + sm.setAvgAge(intArray) + ".");
    }
}
class secMain{
    private int[] driverArray = new int[] {};

    public secMain() {}

    // seimos ilgis (1)
    public int setElemArray(int... elemArray) {
        this.driverArray = elemArray;
        return elemArray.length;
    }

    // vyriausias asmuo (4)
    public int setAge(int... sAge){
        this.driverArray = sAge;
        int age;
        age = Arrays.stream(driverArray).max().getAsInt();
        return age;
    }

    // amziaus vidurkis (5)
    public double setAvgAge(int... sAAge){
        this.driverArray = sAAge;
        double totalAge = 0;double avg;
        for(int i: driverArray){
            totalAge += i;
        }
        avg = totalAge / driverArray.length;
        return avg;
    }

    //    private boolean isDriver;
//
//    public int setDriver(boolean driver) {
//        this.isDriver = driver;
//
//        int d = 0;
//        for(int i : driverArray){
//            if(isDriver){
//                d++;
//            }else{
//                break;
//            }
//        }
//        return d;
//    }
}