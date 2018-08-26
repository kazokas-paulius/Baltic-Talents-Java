package lt.baltictalents._0816.Shapes;

public class Circle {
    private Double r;

    public Circle(Double r) {
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
