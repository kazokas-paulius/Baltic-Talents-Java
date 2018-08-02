package lt.baltictalents._0801._0801_klasesDarbas.family;

public class Son extends FamilyMember implements Driver {

    Son(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return getAge() >= 18;
    }

    @Override
    public boolean canRideABike() {
        return true;
    }
}