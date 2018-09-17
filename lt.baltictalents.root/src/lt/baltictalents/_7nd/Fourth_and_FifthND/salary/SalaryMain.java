package lt.baltictalents._7nd.Fourth_and_FifthND.salary;

//Tarkime turime objektą Employee ir objektą Salary, kuriame yra
//        Employee tipo laukas ir Double tipo laukas reiškiantis išmokėtą
//        atlyginimą.
//        Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio
//        darbuotojo įrašai) ir aprašykite tokius veiksmus naudojant duomenų
//        srautus/vamzdynus (stream/lambda):
//        1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite
//        mažėjimo tvarka pagal išmokėtą sumą: vardas - išmokėta suma
//        2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo
//        išmokėta) yra kiekvienam darbuotojui ir atspausdinkite: vardas -
//        kiek kartų išmokėta.


import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.Map.Entry.*;
import static java.util.stream.Collectors.summingDouble;


public class SalaryMain {
    public static void main(String[] args) {
        Employee maksas = new Employee("Maksas");
        Employee zivile = new Employee("Živilė");

        List<Salary> salaries = new ArrayList<>();

        salaries.add(new Salary(zivile, 350d)); // saldainiams
        salaries.add(new Salary(maksas, 200d)); // nes dirbantis
        salaries.add(new Salary(zivile, 100.0)); // nes nedirbanti
        salaries.add(new Salary(maksas, 50.0)); // uz gerus klausymus
        salaries.add(new Salary(maksas, 17 * 5.0)); // rukymas
        salaries.add(new Salary(zivile, 17 * 10.0)); // rukymas
        salaries.add(new Salary(zivile, 140d)); // premija

        showTotalAmountByEmployees(salaries);
        showNumberOfPaymentsByEmployee(salaries);
    }

    private static void showTotalAmountByEmployees(List<Salary> salaries) {
        System.out.println("Vardas - Algos dydis didejimo tvarka");
        salaries.stream()
                .collect(groupingBy(s -> s.getEmployee().getName(),
                        summingDouble(Salary::getAmount)))
                .entrySet().stream()
                .sorted(comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }

    private static void showNumberOfPaymentsByEmployee(List<Salary> salaries) {
        System.out.println("Vardas - Kiek kartu ismoketa");
        salaries.stream()
                .collect(groupingBy(s -> s.getEmployee().getName(), counting())) // counting - kiek kartu pasikartoja employee su tokiu vardu (entry)
                .forEach((employee, salary) -> System.out.println(employee + ": " + salary));
    }
}
