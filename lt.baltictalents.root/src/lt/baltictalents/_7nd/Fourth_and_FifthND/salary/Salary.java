package lt.baltictalents._7nd.Fourth_and_FifthND.salary;

public class Salary {
    private Employee employee;
    private Double amount;

    public Salary(Employee employee, Double amount) {
        this.employee = employee;
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Double getAmount() {
        return amount;
    }
}
