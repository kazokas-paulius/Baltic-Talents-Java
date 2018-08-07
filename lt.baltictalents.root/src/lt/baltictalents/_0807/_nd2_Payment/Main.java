package lt.baltictalents._0807._nd2_Payment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Employee em1 = new Employee(123456789, "Artiom", 100.01);
        Employee em2 = new Employee(987654321, "Pasha", 50.05);
        Client cl1 = new Client(741852963, "UAB Misha", 750.75);
        Client cl2 = new Client(369258147, "UAB Natasha", 920.92);

        System.out.println("\n" + em1.toString());
        System.out.println(em1.toString() + "\n");

        System.out.println(cl1.toString());
        System.out.println(cl2.toString() + "\n");

        Object[] arrE = new Object[12];
        arrE[0] = em1.bankAcc();
        arrE[1] = em2.bankAcc();
        arrE[2] = em1.amount();
        arrE[3] = em2.amount();
        arrE[4] = em1.owner();
        arrE[5] = em2.owner();
        arrE[6] = cl1.bankAcc();
        arrE[7] = cl2.bankAcc();
        arrE[8] = cl1.amount();
        arrE[9] = cl2.amount();
        arrE[10] = cl1.owner();
        arrE[11] = cl2.owner();

//        System.out.println(Arrays.toString(arrE));

        for(Object i: arrE){
            System.out.println(i);
        }
    }
}
