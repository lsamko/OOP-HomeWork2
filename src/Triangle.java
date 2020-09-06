public class Triangle extends Shape {

    private Point a;
    private Point  b;
    private Point  c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
    }

    @Override
    public double getArea() {
        double aL = a.getDistance(b);
        double bL = b.getDistance(c);
        double cL = c.getDistance(a);
        double polP = (aL + bL + cL) / 2.0;
        return Math.sqrt(polP * (polP - aL) * (polP - bL) * (polP - cL));
    }

    @Override
    public String toString() {
        return "Triangle{" +
            "a=" + a +
            ", b=" + b +
            ", c=" + c +
            '}';
    }
}
