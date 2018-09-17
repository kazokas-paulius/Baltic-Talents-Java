package lt.baltictalents._7nd.SixthND;

public class Main {
    public static void main(String[] args) {
        Container<Employee> box = new Container<>();
        box.add(new Employee("Java Developer"));
        box.add(new Employee("PHP Developer"));

        // pagal pavadinima
        for (Employee emp : box.order((emp1, emp2) ->
                emp1.getName().compareTo(emp2.getName()))) {
            System.out.println(emp);
        }

        System.out.println();

        // pagal raidziu skaiciu
        for (Employee emp : box.order((emp1, emp2) ->{
            return emp1.getName().length() - emp2.getName().length();
        })) {
            System.out.println(emp);
        }
    }
}