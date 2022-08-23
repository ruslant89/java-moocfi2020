
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int numberTwo = Integer.valueOf(scanner.nextLine());

        int sum = number + numberTwo;

        int squareRoot = (int)Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
