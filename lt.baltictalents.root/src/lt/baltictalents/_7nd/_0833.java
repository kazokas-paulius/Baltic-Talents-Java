package lt.baltictalents._7nd;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class _0833 {
    private static List<LocalDate> dates = new ArrayList<>();
    private static List<String> clients = new ArrayList<>();
    private static List<BigDecimal> totals = new ArrayList<>();

    private static final Map<Month, Integer> QUARTERS = new HashMap<>();

    static {
        QUARTERS.put(Month.JANUARY, 1);
        QUARTERS.put(Month.FEBRUARY, 1);
        QUARTERS.put(Month.MARCH, 1);
        QUARTERS.put(Month.APRIL, 1);
        QUARTERS.put(Month.MAY, 2);
        QUARTERS.put(Month.JUNE, 2);
        QUARTERS.put(Month.JULY, 2);
        QUARTERS.put(Month.AUGUST, 2);
        QUARTERS.put(Month.SEPTEMBER, 3);
        QUARTERS.put(Month.OCTOBER, 3);
        QUARTERS.put(Month.NOVEMBER, 3);
        QUARTERS.put(Month.DECEMBER, 3);
    }

    public static void main(String[] args) {
        addToList();
//        sortByQuarters(dates);
    }

    private static void addToList() {
        InvoiceData id1 = new InvoiceData(LocalDate.now().minusYears(4).minusMonths(2), "Paulius Kazokas", new BigDecimal(800.75));
        InvoiceData id2 = new InvoiceData(LocalDate.now().minusYears(2).minusMonths(6), "Arturik Gorbaciovic", new BigDecimal(700.45));
        InvoiceData id3 = new InvoiceData(LocalDate.now().minusYears(1).minusMonths(11), "Vadym Bymbym", new BigDecimal(900.80));

        dates.add(id1.getInDate());
        dates.add(id2.getInDate());
        dates.add(id3.getInDate());

        clients.add(id1.getInClient());
        clients.add(id2.getInClient());
        clients.add(id3.getInClient());

        totals.add(id1.getInTotal());
        totals.add(id2.getInTotal());
        totals.add(id3.getInTotal());


        Map<String, String> mapClient = new TreeMap<>();
        mapClient.put(String.valueOf(sortByQuarters(dates).get(0)), clients.get(0));
        mapClient.put(String.valueOf(sortByQuarters(dates).get(1)), clients.get(1));
        mapClient.put(String.valueOf(sortByQuarters(dates).get(2)), clients.get(2));
//
//        mapClient.keySet().toArray();
//        mapClient.values().toArray();
//
        System.out.println("Mapas: " + mapClient);

//        Object[][][] invoice = new Object[mapClient.values().toArray().length][mapClient.values().toArray().length][totals.size()];
//
//        int count = 0;
//        for (int i = 0; i < invoice.length; i++) {
//            for (int j = 0; j < invoice[i].length; j++) {
//                for (int k = 0; k < invoice[i][j].length; k++) {
//                    invoice[i][j][k] = dates.get(0); // cia turi buti kita value priskirta
//                    count++;
//                    System.out.println("invoice item " + invoice[i][j][k]);
//                    System.out.println("count " + count);
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(invoice));
    }

    private static List<LocalDate> sortByQuarters(List<LocalDate> dateList) {

        Collections.sort(dateList, new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                return (getQuarter(o1.getMonth()) - getQuarter(o2.getMonth()));
            }
        });
        return dateList;
    }

    private static int getQuarter(Month month) {
        return QUARTERS.get(month);
    }
}

class InvoiceData {
    private LocalDate inDate;
    private String inClient;
    private BigDecimal inTotal;

    InvoiceData(LocalDate inDate, String inClient, BigDecimal inTotal) {
        this.inDate = inDate;
        this.inClient = inClient;
        this.inTotal = inTotal;
    }

    public LocalDate getInDate() {
        return inDate;
    }

    public void setInDate(LocalDate inDate) {
        this.inDate = inDate;
    }

    public String getInClient() {
        return inClient;
    }

    public void setInClient(String inClient) {
        this.inClient = inClient;
    }

    public BigDecimal getInTotal() {
        return inTotal;
    }

    public void setInTotal(BigDecimal inTotal) {
        this.inTotal = inTotal;
    }
}
