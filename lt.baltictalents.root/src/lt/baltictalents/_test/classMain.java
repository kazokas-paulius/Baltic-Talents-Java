package lt.baltictalents._test;

public class classMain {
    public static void main(String[] args){
        Human human = new Human();
        Human human2 = new Human();

        human.name = "Paulius";
        human.lastName = "Leonardas Kazokas";
        human.age = 21;
        human.isMarried = true;

        System.out.println(human.name);
        System.out.println(human.lastName);
        System.out.println(human.age);
        System.out.println(human.isMarried);

        human2.name = "Antanas";

        System.out.println(human.name + " -> " + human2.name);

        human.name = human2.name;

        System.out.println("Paulius pakeistas i " + human.name);

        Thing thing = new Thing("Kamuolys", 10, 2);
        Thing thing2 = new Thing(20, 13);
        Thing thing3 = new Thing("Krepsys");
    }
}

class Human{
    String name; //null
    String lastName; //null
    int age; //0
    boolean isMarried; //false
}

class Thing{
    String name;
    int weigth;
    int height;

    // maine turi grazinti objekta su 3 parametrais
    public Thing(String name, int weigth, int height) {
        this.name = name;
        this.weigth = weigth;
        this.height = height;
    }

    // maine turi grazinti objekta su 2 parametrais
    public Thing(int weigth, int height) {
        this.weigth = weigth;
        this.height = height;
    }

    // maine turi grazinti objekta su 1 parametrais
    public Thing(String name) {
        this.name = name;
    }

    // maine galima aprasyti objekta be parametru
    public Thing(){}
}
