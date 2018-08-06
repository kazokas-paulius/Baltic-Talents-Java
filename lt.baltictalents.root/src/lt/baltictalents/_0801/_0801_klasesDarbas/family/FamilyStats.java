package lt.baltictalents._0801._0801_klasesDarbas.family;

public class FamilyStats {
    private FamilyMember[] fm;

    public FamilyStats(FamilyMember... totalMembers) {
        fm = totalMembers;
    }

    public int countFamilymembers() {
        return fm.length;
    }

    public int countFamilyDrivers() {
        int mDriver = 0;
        for (FamilyMember m : fm) {
            if (m instanceof Driver) {
                if(((Driver) m).canDriveACar() == true && ((Driver) m).canRideABike() == true){
                    mDriver++;
                }
            }
        }
        return mDriver;
    }

    public int oldestMember() {
        int oldestMemberIndex = 0;
        int oldestMemberAge = fm[0].getAge();
        for (int i = 1; i < fm.length; i++) {
            if (oldestMemberAge < fm[i].getAge()) {
                oldestMemberAge = fm[i].getAge();
                oldestMemberIndex = i;
            }
        }
        return oldestMemberAge;
    }

    public String oldestMemberName(){
        int oldestMemberIndex = 0;
        int oldestMemberAge = fm[0].getAge();
        for (int i = 1; i < fm.length; i++){
            if (oldestMemberAge < fm[i].getAge()){
                oldestMemberAge = fm[i].getAge();
                oldestMemberIndex = i;
            }
        }
        return fm[oldestMemberIndex].getName();
    }

    public double averageAge() {
        double averageMember = 0.0;
        double suma = 0;
        for (int z =0; z < fm.length; z++) {
            suma += fm[z].getAge();
        }
        averageMember = suma/fm.length;
        return averageMember;
    }
}
