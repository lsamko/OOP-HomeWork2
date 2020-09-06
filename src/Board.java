import java.util.Arrays;

public class Board {

    private Shape[] board = new Shape[4];

    public Board() {
    }

    public void addShape(Shape a, int position) {
        if ((position - 1 >= 0) && (position - 1 < board.length)) {
            board[position - 1] = a;
        } else {
            System.out.println("You can not place here the Shape");
        }
    }

    public void deleteByIndex(int position) {
        if(position -1 >= 0 && position -1 < board.length){
            board[position -1 ] = null;
            System.out.println("Shape deleted");
        }else {
            System.out.println("Wrong position");
        }
    }

    public double getSumArea() {
        double sum = 0;
        for (Shape shape : board) {
            if (shape == null) {
                continue;
            }
            sum += shape.getArea();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Board{" +
            "board=" + Arrays.toString(board) +
            '}';
    }
}
