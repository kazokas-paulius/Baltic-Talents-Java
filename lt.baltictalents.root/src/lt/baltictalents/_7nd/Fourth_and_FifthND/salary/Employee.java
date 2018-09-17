package lt.baltictalents._7nd.Fourth_and_FifthND.salary;

public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
