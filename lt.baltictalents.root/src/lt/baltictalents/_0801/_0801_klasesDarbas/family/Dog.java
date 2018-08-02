package lt.baltictalents._0801._0801_klasesDarbas.family;

class Dog extends FamilyMember {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return false;
    }

    @Override
    public boolean canRideABike() {
        return false;
    }
}
