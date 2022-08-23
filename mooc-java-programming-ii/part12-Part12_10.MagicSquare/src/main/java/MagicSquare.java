
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public MagicSquare(int[][] arr) {
        this.square = arr;
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sumOfRows = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            int sum = 0;
            for (int col = 0; col < square[row].length; col++) {
                System.out.println("row-col index: " + row + "-" + col);
                System.out.println("row-col: " + square[row][col]);
                sum += square[row][col];
            }
            sumOfRows.add(sum);
        }

        return sumOfRows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sumOfCols = new ArrayList<>();

        // Option 1 - iterating over rows but getting column
//        for (int row = 0; row < square.length; row++) {
//            int sum = 0;
//            for (int col = 0; col < square[row].length; col++) {
//                System.out.println( col + "-" + row);
//                System.out.println("col-row: " + square[col][row]);
//                sum += square[col][row];
//            }
//            sumOfCols.add(sum);
//        }

        // Option 2 - iterating over columns first
        for (int col = 0; col < square[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < square.length; row++) {
                System.out.println("row-col index: " + row + "-" + col);
                System.out.println("row-col: " + square[row][col]);
                sum += square[row][col];
            }
            sumOfCols.add(sum);
        }

        return sumOfCols;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
        int primaryDiagonals = 0;
        for (int row = 0; row < square.length; row++) {
            primaryDiagonals += square[row][row];
        }

        sumOfDiagonals.add(primaryDiagonals);

        int secondaryDiagonals = 0;
        int col = square.length - 1;
        for (int row = 0; row < square.length; row++) {
            secondaryDiagonals += square[row][col--];

        }
        sumOfDiagonals.add(secondaryDiagonals);

        return sumOfDiagonals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
