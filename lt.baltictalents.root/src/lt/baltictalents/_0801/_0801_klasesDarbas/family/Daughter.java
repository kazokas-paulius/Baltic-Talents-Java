package lt.baltictalents._0801._0801_klasesDarbas.family;

public class Daughter extends FamilyMember implements Driver {
    Daughter(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return false;
    }

    @Override
    public boolean canRideABike() {
        return true;
    }
}
