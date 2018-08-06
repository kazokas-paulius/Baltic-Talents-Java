package lt.baltictalents._0806;

public class Calc{

    private static final double PI = 3.14;
    private Circle c;
    private Triangle t;

    public Calc(Circle crcl){
        c = crcl;
    }

    public Calc(Triangle trngl){
        t = trngl;
    }

    public Calc() {

    }

    public double cArea(Circle c){
        return PI * (c.getR() * c.getR());
    }

    public double cPerimeter(Circle c){
        return (2 * PI * c.getR());
    }

    public double tArea(Triangle t){
        double area = 0.0;
        double halfP = 0.0;

        // Herono formule...tipo
        halfP = ((t.getA() + t.getB() + t.getC()) / 2);
        area = Math.sqrt(halfP * (halfP - t.getA()) * (halfP - t.getB()) * (halfP - t.getC()));

        return area;
    }

    public double tPerimeter(Triangle t){
        return (t.getA() + t.getB() + t.getC());
    }
}