
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                if (sum > 0) {
                    double average = (double)sum / count;
                    System.out.println(average);
                    break;
                } else {
                    System.out.println("Cannot calculate the average");
                    break;
                }
            }

            if (input > 0) {
                sum += input;
                count++;
            }
        }
    }
}
