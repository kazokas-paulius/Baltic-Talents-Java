package lt.baltictalents._0820;

import java.util.*;

public class Salary {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Paulius"));
        employees.add(new Employee("Margarita"));
        employees.add(new Employee("Antanas"));
        employees.add(new Employee("Toma"));

        List<Double> salaries = new ArrayList<>();
        salaries.add(450.59);
        salaries.add(670.39);
        salaries.add(580.79);
        salaries.add(980.99);

        Map<Double, Employee> summary = new HashMap<>();
        summary.put(salaries.get(0),employees.get(0));
        summary.put(salaries.get(1),employees.get(1));
        summary.put(salaries.get(2),employees.get(2));
        summary.put(salaries.get(3),employees.get(3));

        summary.forEach((sal,nam)-> System.out.println("Salary: " + sal + " Name: " + nam + "."));

        Map<Double, Employee> summaryBySalary = new TreeMap<>(Collections.reverseOrder());
        summaryBySalary.putAll(summary);

        System.out.println(summaryBySalary);


//        for(Map.Entry<Double, Employee> entry : summary.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
    }
}
