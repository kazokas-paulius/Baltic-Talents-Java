package lt.baltictalents._0731;

public class nd1_Main {
    public static void main(String[] args){
        Car carVar = new Car();
        carVar.setOwner(new Owner("paulius","kazokas"));
        carVar.setMake("kazkas");
        carVar.setRegistrationNumber(123);

    }
}

class Car{
    private int registrationNumber;
    private String make;
    private Owner owner;

    public Car() {}

    public Car(String kazkas) {
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
class Owner{
    String firstname;
    String lastname;

    public Owner() {}

    public Owner(String fName, String lName) {
    }
}