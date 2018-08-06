package lt.baltictalents._0801._0801_klasesDarbas.family;

abstract class FamilyMember{
    private final String name;
    private final int age;

    FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}
