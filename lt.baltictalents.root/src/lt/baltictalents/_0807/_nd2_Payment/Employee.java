package lt.baltictalents._0807._nd2_Payment;

public class Employee implements Payment{

    private final int bankAccE;
    private final String ownerE;
    private final double sumaE;

    public Employee(int bankAccE, String ownerE, double sumaE) {
        this.bankAccE = bankAccE;
        this.ownerE = ownerE;
        this.sumaE = sumaE;
    }

    @Override
    public int bankAcc() {
        return bankAccE;
    }

    @Override
    public String owner() {
        return ownerE;
    }

    @Override
    public double amount() {
        return sumaE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "bankAccE=" + bankAccE +
                ", ownerE='" + ownerE + '\'' +
                ", sumaE=" + sumaE +
                '}';
    }
}
