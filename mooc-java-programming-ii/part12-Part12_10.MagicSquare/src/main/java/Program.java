
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        //System.out.println(msFactory.createMagicSquare(5));

        int[][] matrix = {
                {2, 1},
                {5, 7}
        };

        MagicSquare square = new MagicSquare(matrix);
        System.out.println("Sum of rows: " + square.sumsOfRows());
        System.out.println("Sum of cols: " + square.sumsOfColumns());
        System.out.println("Sum of diagonals: " + square.sumsOfDiagonals());
    }
}
