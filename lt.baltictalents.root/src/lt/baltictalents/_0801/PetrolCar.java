package lt.baltictalents._0801;

public class PetrolCar extends Car{
    private static final String PETROL = "petrol";

    public PetrolCar(String registrationNumber, String make, Owner owner) {
        super(registrationNumber, make, owner);
    }

    @Override
    protected String getFuelType() {
        return PETROL;
    }
}
