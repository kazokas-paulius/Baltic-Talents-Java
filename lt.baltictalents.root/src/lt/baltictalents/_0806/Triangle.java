package lt.baltictalents._0806;

public class Triangle implements Shape{

    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double area() {
        double area = 0.0;
        double halfP = 0.0;

        halfP = ((a + b + c) / 2);
        area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));

        return area;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
