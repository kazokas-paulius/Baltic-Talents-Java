package lt.baltictalents._0809.CarExsercise;

import java.util.Comparator;

class Car implements Comparable<Car> {
    private String name;
    private String gearBox;
    private int maxSpeed;

    public Car(String name, String gearBox, int maxSpeed) {
        this.name = name;
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car anotherCar) {
        return this.getName().compareTo(anotherCar.getName());
    }

    public Car(String gearBox) {
        this.gearBox = gearBox;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car() { }

    public String getName() {
        return name;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {// manual arba automatic | equals
        if (gearBox.equals("manual") || gearBox.equals("automatic")) {
            this.gearBox = gearBox;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    static class CarsComparatorByGearbox implements Comparator<Car> {

        @Override
        public int compare(Car car1, Car car2) {
            return car1.getGearBox().compareTo(car2.getGearBox());
        }
    };
}
