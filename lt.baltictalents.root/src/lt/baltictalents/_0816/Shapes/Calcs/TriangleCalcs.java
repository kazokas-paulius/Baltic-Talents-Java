package lt.baltictalents._0816.Shapes.Calcs;

import lt.baltictalents._0816.Shapes.Triangle;

public class TriangleCalcs extends Triangle {

    public TriangleCalcs(Double a, Double b, Double c) {
        super(a, b, c);
    }

    public double tP(double aa, double bb, double cc){
        aa = getA(); bb = getB(); cc = getC();
        return aa + bb + cc;
    }

    public double tA(double aa, double bb, double cc){
        aa = getA(); bb = getB(); cc = getC();
        return (aa + bb + cc) / 2;
    }
}
