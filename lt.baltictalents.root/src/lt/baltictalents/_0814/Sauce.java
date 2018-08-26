package lt.baltictalents._0814;

public enum Sauce {
    MILD("very soft taste"),
    SPICY("kinda spicy taste it has"),
    MIX("sometimes mildy, sometimes spicy");

    private final String desc;

    Sauce(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Sauce{" + "desc='" + desc + '\'' + '}';
    }
}
