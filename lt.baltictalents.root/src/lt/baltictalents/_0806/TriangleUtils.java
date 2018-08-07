package lt.baltictalents._0806;

public class TriangleUtils {

    static double getArea(Triangle t){
        return t.area();
    }

    static double getArea(double a, double b, double c){
        double area = 0.0;
        double halfP = 0.0;

        halfP = ((a + b + c) / 2);
        area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));

        return area;
    }


    static double getPerimeter(Triangle t){
        return t.perimeter();
    }

    static double getPerimeter(double a, double b, double c){
        return a + b + c;
    }
}
