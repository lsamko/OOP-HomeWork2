public class Circle extends Shape {

    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Circle() {
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

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * a.getDistance(b);
    }

    @Override
    public double getArea() {
      return  Math.PI * Math.sqrt(a.getDistance(b));
    }

    @Override
    public String toString() {
        return "Circle{" +
            "a=" + a +
            ", b=" + b +
            '}';
    }
}
