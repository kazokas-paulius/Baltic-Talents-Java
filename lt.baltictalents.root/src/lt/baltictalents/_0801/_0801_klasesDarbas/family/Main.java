package lt.baltictalents._0801._0801_klasesDarbas.family;

public class Main extends FamilyStats{

    public static void main(String[] args) {
        System.out.println("Pirma seima \n");
        Father father1 = new Father("Antanas", 40);
        Mother mother1 = new Mother("Antanina", 39);
        Son son1 = new Son("Antonas", 20);
        Daughter daughter1 = new Daughter("Tania", 15);
        FamilyMember[] family1 = {father1, mother1, son1, daughter1};

        for (FamilyMember f1 : family1) {
            System.out.println(f1.getName() + " " + f1.getAge());
        }

        System.out.println("\nTeises:\n");
        System.out.println("Ar " + father1.getName() +
                " gali vairuoti masina: " + (father1.canDriveACar())
                + "; ar gali vaziuoti dviraciu: " + father1.canRideABike() + ".");

        System.out.println("Ar " + mother1.getName() +
                " gali vairuoti masina: " + mother1.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + mother1.canRideABike() + ".");

        System.out.println("Ar " + son1.getName() +
                " gali vairuoti masina: " + son1.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + son1.canRideABike() + ".");

        System.out.println("Ar " + daughter1.getName() +
                " gali vairuoti masina: " + daughter1.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + daughter1.canRideABike() + ".\n");

        System.out.println("Antra seima \n");
        Father father2 = new Father("Bronius", 50);
        Mother mother2 = new Mother("Bronislava", 45);
        Son son2 = new Son("Bartas", 15);
        FamilyMember dog2 = new Dog("Bobikas", 7);

        FamilyMember[] family2 = {father2, mother2, son2, dog2};

        for (FamilyMember f2 : family2) {
            System.out.println(f2.getName() + " " + f2.getAge());
        }

        System.out.println("\nTeises:\n");
        System.out.println("Ar " + father2.getName() +
                " gali vairuoti masina: " + (father2.canDriveACar())
                + "; ar gali vaziuoti dviraciu: " + father2.canRideABike() + ".");

        System.out.println("Ar " + mother2.getName() +
                " gali vairuoti masina: " + mother2.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + mother2.canRideABike() + ".");

        System.out.println("Ar " + son2.getName() +
                " gali vairuoti masina: " + son2.canDriveACar()
                + "; ar gali vaziuoti dviraciu: " + son2.canRideABike() + ".\n");

        FamilyStats fs1 = new FamilyStats(family1);
        System.out.println("Pirmos seimos dydis: " +
                fs1.countFamilymembers() + "\n");
        FamilyStats fs2 = new FamilyStats(family2);
        System.out.println("Pirmos seimos dydis: " +
                fs2.countFamilymembers() + "\n");
        System.out.println("Pirmos seimos nariai gali vairuoti viska " +
                fs1.countFamilyDrivers() + "\n");
        System.out.println("Antros seimos nariai gali vairuoti viska " +
                fs2.countFamilyDrivers() + "\n");
        System.out.println("Vyriausias seimos narys " +
                fs1.oldestMember() + "\n");
        System.out.println("Vidutinis seimos amzius " +
                fs1.averageAge() + "\n");

        System.out.println("seniausias seimos 1 vardas: " +
                fs1.oldestMemberName() + "\n");
        System.out.print("seniausias seimos 2 vardas: " +
                fs2.oldestMemberName());
    }
}
