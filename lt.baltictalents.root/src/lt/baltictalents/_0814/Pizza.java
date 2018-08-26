package lt.baltictalents._0814;

public class Pizza {

    private final String name;

    Pizza(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + '}';
    }
}

class Box<T1,T2>{
    private final T1 item1;
    private final T2 item2;

    Box(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    void Content(){
        System.out.println(item1 + " " + item2);
    }
}
