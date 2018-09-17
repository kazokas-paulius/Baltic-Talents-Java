package lt.baltictalents._7nd.Fourth_and_FifthND.invoice;

//Sukurkite sąskatas-faktūras aprašančią klasę, kurioje būtų
//        sąskaitpos datos laukas (LocalDate), kliento laukas (klasė arba
//        tik String tipo) ir sumos laukas (BigDecimal).
//        Sukurkite sąrašą tokių įrašų su skirtingomis datomis ir
//        sumomis.
//        Parašykite metodą kuris iš sąrašo suformuoja kitą sąrašą -
//        ataskaitą parodančią kokios yra pajamos pagal ketvirčius.

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class InvoiceMain {

    private static final Map<Month, Integer> QUARTERS;

    static {
        QUARTERS = new HashMap<>();
        QUARTERS.put(Month.JANUARY, 1);
        QUARTERS.put(Month.FEBRUARY, 1);
        QUARTERS.put(Month.MARCH, 1);
        QUARTERS.put(Month.APRIL, 2);
        QUARTERS.put(Month.MAY, 2);
        QUARTERS.put(Month.JUNE, 2);
        QUARTERS.put(Month.JULY, 3);
        QUARTERS.put(Month.AUGUST, 3);
        QUARTERS.put(Month.SEPTEMBER, 3);
        QUARTERS.put(Month.OCTOBER, 4);
        QUARTERS.put(Month.NOVEMBER, 4);
        QUARTERS.put(Month.DECEMBER, 4);
    }

    public static void main(String[] args) {
        List<Invoice> invoices = Arrays.asList(
                new Invoice(LocalDate.now().minusMonths(8), "e1", BigDecimal.valueOf(46)),
                new Invoice(LocalDate.now().plusMonths(1), "e1", BigDecimal.valueOf(61)),
                new Invoice(LocalDate.now().minusMonths(5), "e1", BigDecimal.valueOf(20)),
                new Invoice(LocalDate.now().plusDays(100), "e2", BigDecimal.valueOf(40)),
                new Invoice(LocalDate.now().plusWeeks(40), "e2", BigDecimal.valueOf(18)),
                new Invoice(LocalDate.now().minusMonths(45), "e2", BigDecimal.valueOf(74)),
                new Invoice(LocalDate.now().minusMonths(2), "e2", BigDecimal.valueOf(66))
        );

        invoices.stream()
                .collect(groupingBy(i -> QUARTERS.get(i.getDate().getMonth()),
                        summingDouble(d -> d.getAmount().doubleValue())))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}