package lt.baltictalents._0806;

public class Rectangle implements Shape{

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double area() {
        if(isSquare())
            return Math.pow(a, 2);
        else
            return a * b;
    }

    @Override
    public double perimeter() {
        if(isSquare())
            return 4 * a;
        else
            return (2 * a) + (2 * b);
    }

    public boolean isSquare(){
        return a == b; //pasigilinti
    }
}
