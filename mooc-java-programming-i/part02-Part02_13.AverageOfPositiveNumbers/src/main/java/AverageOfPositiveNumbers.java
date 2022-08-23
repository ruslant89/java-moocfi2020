
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPositives = 0;
        int sum = 0;
        double averageOfPositives = 0.0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                countOfPositives = countOfPositives + 1;
                sum = sum + number;
                averageOfPositives = (double)sum / countOfPositives;
            }
        }

        if (countOfPositives > 0) {
            System.out.println(averageOfPositives);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
