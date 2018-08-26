package lt.baltictalents._0816.Shapes;

import lt.baltictalents._0816.Shapes.Calcs.CircleCalcs;
import lt.baltictalents._0816.Shapes.Calcs.RectangleCalcs;
import lt.baltictalents._0816.Shapes.Calcs.TriangleCalcs;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShapeComparators {

    public static void main(String[] args) {

//        DecimalFormat frmt = new DecimalFormat("#0.00");

        Circle c = new Circle(2.15);
        Triangle t = new Triangle(4.51, 2.11, 3.61);
        Rectangle r = new Rectangle(2.83, 3.04);

        CircleCalcs cc = new CircleCalcs(c.getR());
        TriangleCalcs tc = new TriangleCalcs(t.getA(), t.getB(), t.getC());
        RectangleCalcs rc = new RectangleCalcs(r.getA(), r.getB());

        List<Double> areaData = new ArrayList<>();
        areaData.add(cc.ca(c.getR()));
        areaData.add(tc.tA(t.getA(), t.getB(), t.getC()));
        areaData.add(rc.ra(r.getA(), r.getB()));

        List<Double> periData = new ArrayList<>();
        periData.add(cc.cp(c.getR()));
        periData.add(tc.tP(t.getA(), t.getB(), t.getC()));
        periData.add(rc.rp(r.getA(), r.getB()));

        Collections.sort(areaData, (area1, area2) -> (int) (area1 - area2));

        System.out.println("(Area) Lower to higher: " + areaData);

        Collections.sort(areaData, (area1, area2) -> (int) (area2 - area1));

        System.out.println("(Area) Higher to lower: " + areaData);

        Collections.sort(periData, (peri1, peri2) -> (int) (peri1 - peri2));

        System.out.println("(Perimeter) Lower to Higher: " + periData);

        Collections.sort(periData, (peri1, peri2) -> (int) (peri2 - peri1));

        System.out.println("(Perimeter) Higher to Lower: " + periData);

        // nzn kaip komparint komparatorius...

    }
}
