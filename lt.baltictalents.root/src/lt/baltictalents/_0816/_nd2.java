package lt.baltictalents._0816;

public class _nd2 {
    public static void main(String[] args) {
        Point pt = new Point(10, 2);
        System.out.println("X: " + pt.getX() + " Y: " + pt.getY());
    }
}

class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x = x - y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y = y - x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
