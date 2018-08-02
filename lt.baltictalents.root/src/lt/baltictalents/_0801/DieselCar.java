package lt.baltictalents._0801;

public class DieselCar extends Car{
    private static final String DIESEL = "diesel";

    public DieselCar(String registrationNumber, String make, Owner owner) {
        super(registrationNumber, make, owner);
    }

    @Override
    protected String getFuelType() {
        return DIESEL;
    }
}
