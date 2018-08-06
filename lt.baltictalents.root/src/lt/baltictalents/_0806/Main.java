package lt.baltictalents._0806;

import java.text.DecimalFormat;

public class Main extends Calc{
    public Main(Circle crcl) {
        super(crcl);
    }

    public Main(Triangle trngl) {
        super(trngl);
    }

    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.00");

        Circle c = new Circle(12.54);
        Triangle t = new Triangle(14.5, 3.8, 7.4);

        Calc clc = new Calc();

        System.out.println("Calculations\n");
        System.out.println("Circle area: " + df.format(clc.cArea(c)) + " cm\u00B2.");
        System.out.println("Circle perimeter " + df.format(clc.cPerimeter(c)) + " cm." + "\n");
        System.out.println("Triangle area: " + df.format(clc.tArea(t)) + " cm\u00B2.");
        System.out.println("Triangle perimeter: " + df.format(clc.tPerimeter(t)) + " cm.");
    }
}
