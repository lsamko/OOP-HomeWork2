public class Main {

    public static void main(String[] args) {
        Point a = new Point(1, 14);
        Point b = new Point(25, 0);
        Point c = new Point(14, 8);

        Triangle triangle = new Triangle(a, b, c);
        Circle circle = new Circle(a, b);

        Board board = new Board();
        board.addShape(triangle, 1);
        board.addShape(circle, 5);
        System.out.println(board);

        board.deleteByIndex(5);

        double trArea = triangle.getArea();
        double cArea = circle.getArea();
        System.out.println(trArea);
        System.out.println(cArea);
        System.out.println("Sum " + board.getSumArea());
    }
}
