package lt.baltictalents._0731;

public class nd1_Main {
    public static void main(String[] args){
        Car carVar = new Car();
        carVar.registrationNumber = 123456789;
        carVar.make = "AudiA5";
        carVar.firstname = "Paulius";
        carVar.lastname = "Leonardas Kazokas";
        carVar.owner = carVar.firstname + " " + carVar.lastname;
        System.out.println(carVar.registrationNumber + " " + carVar.make + " " + carVar.owner);

        Car carVar2 = new Car();
        carVar2.registrationNumber = 147852369;
        carVar2.make = "ToyotaRAW";
        carVar2.firstname = "Antanas";
        carVar2.lastname = "Antanaitis";
        carVar2.owner = carVar2.firstname + " " + carVar2.lastname;
        System.out.print(carVar2.registrationNumber + " " + carVar2.make + " " + carVar2.owner);
    }
}
class Car extends Owner{
    int registrationNumber;
    String make;
    String owner;

    public Car() {}
}
class Owner{
    String firstname;
    String lastname;

    public Owner() {}
}