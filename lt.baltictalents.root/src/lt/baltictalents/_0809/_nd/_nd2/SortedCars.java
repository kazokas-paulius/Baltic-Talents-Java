package lt.baltictalents._0809._nd._nd2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortedCars {
    private static final String AUTOMATIC = "automatic";
    private static final String MANUAL = "manual";

    public static void main(String[] args) {
        Owner owner = new Owner("fname", "lname");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", AUTOMATIC, 200, owner, "ABC 123"));
        cars.add(new Car("Opel", MANUAL, 220, owner, "DEF 456"));
        cars.add(new Car("Audi", AUTOMATIC, 190, owner, "GHI 789"));
        cars.add(new Car("BMW", MANUAL, 180, owner, "JKL 147"));
        cars.add(new Car("MB", AUTOMATIC, 240, owner, "MNO 258"));

        System.out.println("\n\nCars raw data");
        System.out.println(cars);
        System.out.println("\n\nCars ordered by name");
        Collections.sort(cars);
        System.out.println(cars);

        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);

        System.out.println("\n\nCars ordered by speed");

        Collections.sort(cars, new CarsComparatorBySpeed());
        System.out.println(cars);
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car2.getMaxSpeed() - car1.getMaxSpeed();
            }
        });
        System.out.println(cars);

        System.out.println("\n\nCars ordered by car plate numbers");
        InnerClassSortByCarNumbers asdasdasd = new InnerClassSortByCarNumbers();
        asdasdasd.SortedPlateAlgo();

    }

    static class InnerClassSortByFirstnameLastChar {

        public static void main(String[] args) {
            List<Owner> oList = new ArrayList<>();

            oList.add(new Owner("Carl", "Malone"));
            oList.add(new Owner("Elizabeth", "Vroughelson"));
            oList.add(new Owner("Caroline", "Green"));
            oList.add(new Owner("Tom", "Edison"));
            oList.add(new Owner("Simone", "Wherlsenson"));

            Collections.sort(oList, new Comparator<Owner>() {
                @Override
                public int compare(Owner own1, Owner own2) {
                    return own1.getFirstName().charAt(own1.getFirstName().length() - 1) -
                            own2.getFirstName().charAt(own2.getFirstName().length() - 1);
                }
            });
            System.out.println(oList);
        }
    }

     public static class InnerClassSortByCarNumbers{

        public void SortedPlateAlgo() {
            Owner owner = new Owner("fname", "lname");
            List<Car> cList = new ArrayList<>();

            cList.add(new Car("Toyota", AUTOMATIC, 200, owner, "KLK 102"));
            cList.add(new Car("Opel", MANUAL, 220, owner, "HKR 223"));
            cList.add(new Car("Audi", AUTOMATIC, 190, owner, "OKR 224"));
            cList.add(new Car("BMW", MANUAL, 180, owner, "VDI 222"));
            cList.add(new Car("MB", AUTOMATIC, 240, owner, "APB 172"));

            List<Car> plateNumberList = new ArrayList<>();
            System.out.println("Adding plate numbers to array ...");
            for(Car c : cList){
                String getNumber = "";
                getNumber = c.getPlateNumber().substring(4, c.getPlateNumber().length());
                plateNumberList.add(c);
                System.out.print(getNumber + " ");
                Collections.sort(plateNumberList, new Comparator<Car>() {
                    @Override
                    public int compare(Car car1, Car car2) {
                        String c1p = car1.getPlateNumber().substring(4, car1.getPlateNumber().length());
                        String c2p = car2.getPlateNumber().substring(4, car2.getPlateNumber().length());
                        return c1p.compareTo(c2p);
                    }
                });
            }
            System.out.println("\nOrdered by car plate number\n" + plateNumberList);
        }
    }
}