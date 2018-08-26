package lt.baltictalents._0816.Shapes.Calcs;

import lt.baltictalents._0816.Shapes.Circle;

public class CircleCalcs extends Circle {

    public CircleCalcs(Double r) {
        super(r);
    }

    public double cp(double rr){
        rr = getR();
        return 2 * 2.14 * rr;
    }

    public double ca(double rr){
        rr = getR();
        return (2.14 * (rr * rr));
    }
}
