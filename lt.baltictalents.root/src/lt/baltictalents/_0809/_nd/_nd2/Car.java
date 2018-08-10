package lt.baltictalents._0809._nd._nd2;

class Car implements Comparable<Car> {
    private String name;
    private String gearBox;
    private int maxSpeed;
    private Owner owner;
    private String plateNumber;

    public Car(String name, String gearBox, int maxSpeed, Owner owner, String plateNumber) {
        this.name = name;
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
        this.owner = owner;
        this.plateNumber = plateNumber;
    }

    @Override
    public int compareTo(Car anotherCar) {
        return this.getName().compareTo(anotherCar.getName());
    }

    public String getName() {
        return name;
    }

    public String getGearBox() {
        return gearBox;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", owner=" + owner +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }
}