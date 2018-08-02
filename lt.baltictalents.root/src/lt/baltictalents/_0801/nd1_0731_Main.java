package lt.baltictalents._0801;

public class nd1_0731_Main {
    public static void main(String[] args){
        Owner owner = new Owner("paulius", "kazokas");
        Car carP = new PetrolCar("123", "Opel",
                owner);
        Car carD = new DieselCar("456", "Audi",
                owner);

        Car[] cars = {carP, carD};

        for(Car c : cars){
            System.out.println(c.getMake() + ": " + c.getFuelType());
        }
    }
}