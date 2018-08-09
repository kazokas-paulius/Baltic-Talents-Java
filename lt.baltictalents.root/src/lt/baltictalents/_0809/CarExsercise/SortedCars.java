package lt.baltictalents._0809.CarExsercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortedCars {
    private static final String AUTOMATIC = "automatic";
    private static final String MANUAL = "manual";

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", AUTOMATIC, 200));
        cars.add(new Car("Opel", MANUAL, 220));
        cars.add(new Car("Audi", AUTOMATIC, 190));
        cars.add(new Car("BMW", MANUAL, 180));
        cars.add(new Car("MB", AUTOMATIC, 240));

        System.out.println(cars);
        System.out.println("By name (ASC)");
        Collections.sort(cars);
        System.out.println(cars);

        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);

        System.out.println("By speed");

        Collections.sort(cars, new CarsComparatorBySpeed());
        System.out.println(cars);
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car2.getMaxSpeed() - car1.getMaxSpeed();
            }
        });
        Collections.sort(cars, new Car.CarsComparatorByGearbox().reversed());
        System.out.println("By gearbox (manual then automatic)");
        System.out.println(cars);
    }
}