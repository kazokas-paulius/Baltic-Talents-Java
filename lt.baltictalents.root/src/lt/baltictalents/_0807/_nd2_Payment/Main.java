package lt.baltictalents._0807._nd2_Payment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Employee em1 = new Employee(123456789, "Artiom", 100.01);
        Employee em2 = new Employee(987654321, "Pasha", 50.05);
        Client cl1 = new Client(741852963, "UAB Misha", 750.75);
        Client cl2 = new Client(369258147, "UAB Natasha", 920.92);

        Payment[] arrE = new Payment[4];
        arrE[0] = em1;
        arrE[1] = em2;
        arrE[2] = cl1;
        arrE[3] = cl2;

        System.out.println(Arrays.toString(arrE));

//        for(Payment i: arrE){
//            System.out.println(i);
//        }
    }
}
