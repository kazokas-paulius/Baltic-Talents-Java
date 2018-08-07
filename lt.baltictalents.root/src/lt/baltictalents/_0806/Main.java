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

        Circle c = new Circle(6.54);
        Rectangle r = new Rectangle(8.2, 3.7);
        Triangle t = new Triangle(4.1, 3.8, 6.2);

        System.out.print("Circle Area: ");
        ShapeUtils.printArea(c);
        System.out.print("Circle Perimeter: ");
        ShapeUtils.printPerimeter(c);

        System.out.print("\nRectangle Area: ");
        ShapeUtils.printArea(r);
        System.out.print("Rectangle Perimeter: ");
        ShapeUtils.printPerimeter(r);

        System.out.print("\nTriangle Area: ");
        ShapeUtils.printArea(t);
        System.out.print("Triangle Perimeter: ");
        ShapeUtils.printPerimeter(t);
    }
}
