package lt.baltictalents._0816.Shapes.Calcs;

import lt.baltictalents._0816.Shapes.Rectangle;

public class RectangleCalcs extends Rectangle {
    public RectangleCalcs(Double a, Double b) {
        super(a, b);
    }

    public double rp(double aa, double bb){
        aa = getA(); bb= getB();
        return ((aa * 2) + (bb * 2));
    }

    public double ra(double aa, double bb){
        aa = getA(); bb= getB();
        return aa * bb;
    }
}
