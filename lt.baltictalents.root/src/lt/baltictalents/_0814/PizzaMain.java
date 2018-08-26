package lt.baltictalents._0814;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Sicilieciu");
        Box<Pizza, Sauce> dezute = new Box<>(pizza, Sauce.MILD);
        dezute.Content();
    }
}
