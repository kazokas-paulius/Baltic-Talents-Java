package lt.baltictalents._0801._0801_klasesDarbas.family;


import static java.lang.String.valueOf;

public class Main extends FamilyStats{

    public static void main(String[] args) {
        Father father1 = new Father("Antanas", 40);
        Mother mother1 = new Mother("Antanina", 39);
        Son son1 = new Son("Antonas", 20);
        Daughter daughter1 = new Daughter("Tania", 15);
        FamilyMember[] family1 = {father1, mother1, son1, daughter1};
//        FamilyStats f1Size = new FamilyStats(family1.length);
//        System.out.println("seimos dydis: " + String.valueOf(f1Size));
        for (FamilyMember f1 : family1) {
            System.out.println(f1.getName() + " " + f1.getAge());
        }


        System.out.println("Teises:");
        System.out.println("Ar " + father1.getName() + " gali vairuoti masina: " + (father1.canDriveACar())
                + "; ar gali vaziuoti dviraciu: " + father1.canRideABike() + ".");

        System.out.println("Ar " + mother1.getName() + " gali vairuoti masina: " + mother1.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + mother1.canRideABike() + ".");

        System.out.println("Ar " + son1.getName() + " gali vairuoti masina: " + son1.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + son1.canRideABike() + ".");

        System.out.println("Ar " + daughter1.getName() + " gali vairuoti masina: " + daughter1.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + daughter1.canRideABike() + ".");
        System.out.println("\n");
        Father father2 = new Father("Bronius", 50);
        Mother mother2 = new Mother("Bronislava", 45);
        Son son2 = new Son("Bartas", 15);
        FamilyMember dog2 = new Dog("Bobikas", 7);

        FamilyMember[] family2 = {father2, mother2, son2, dog2};

        for (FamilyMember f2 : family2) {
            System.out.println(f2.getName() + " " + f2.getAge());
        }

        System.out.println("Teises:");
        System.out.println("Ar " + father2.getName() + " gali vairuoti masina: " + (father2.canDriveACar())
                + "; ar gali vaziuoti dviraciu: " + father2.canRideABike() + ".");

        System.out.println("Ar " + mother2.getName() + " gali vairuoti masina: " + mother2.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + mother2.canRideABike() + ".");

        System.out.println("Ar " + son2.getName() + " gali vairuoti masina: " + son2.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + son2.canRideABike() + ".");

        System.out.println("family1 size: " + family1.length);
        System.out.println("family2 size: " + family2.length);

        int driversCount1 = 0;
        for(FamilyMember f1Drivers : family1) {
            if(f1Drivers.canDriveACar() == true){
                driversCount1++;
            }
        }
        System.out.println("Family1 drivers: " + driversCount1);

        int driversCount2 = 0;
        for(FamilyMember f2Drivers : family2) {
            if(f2Drivers.canDriveACar() == true){
                driversCount2++;
            }
        }
        System.out.println("Family2 drivers: " + driversCount2);
    }
}
