package lt.baltictalents._test;

public class kdCarMain {
    public static void main(String[] args){
        Car carVar = new Car();
        System.out.print(carVar.getGearBox() + " " + carVar.getMaxSpeed());
    }
}

class Car{
    private String gearBox = "Auto";
    private int maxSpeed = 230;

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String gearBox, int maxSpeed) {
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    public Car() {}
}