package lt.baltictalents._0807._nd2_Payment;

public class Client implements Payment {

    private final int bankAccC;
    private final String ownerC;
    private final double sumaC;

    public Client(int bankAccC, String ownerC, double sumaC) {
        this.bankAccC = bankAccC;
        this.ownerC = ownerC;
        this.sumaC = sumaC;
    }

    @Override
    public int bankAcc() {
        return bankAccC;
    }

    @Override
    public String owner() {
        return ownerC;
    }

    @Override
    public double amount() {
        return sumaC;
    }
}
