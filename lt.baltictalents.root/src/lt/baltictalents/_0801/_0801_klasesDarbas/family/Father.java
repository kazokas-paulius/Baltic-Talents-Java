package lt.baltictalents._0801._0801_klasesDarbas.family;

public class Father extends FamilyMember implements Driver {

    Father(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return true;
    }

    @Override
    public boolean canRideABike() {
        return true;
    }


}
