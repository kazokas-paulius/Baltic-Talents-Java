package lt.baltictalents._0806;

public class RectangleUtils {

    static double getArea(Rectangle r){
        return r.area();
    }

    static double getArea(double a, double b){
        return a * b;
    }

    static double getPerimeter(Rectangle p){
        return p.perimeter();
    }

    static double getPerimeter(double a, double b){
        return 2 * a + 2 * b;
    }
}
