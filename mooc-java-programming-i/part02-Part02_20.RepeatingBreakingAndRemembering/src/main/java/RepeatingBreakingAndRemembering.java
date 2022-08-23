
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numberOfNumbers = 0;
        double average = 0.0;
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            sum += number;
            numberOfNumbers++;
            average = (double)sum / numberOfNumbers;

            if (number % 2 == 0) {
                countOfEvenNumbers++;
            } else {
                countOfOddNumbers++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + countOfEvenNumbers);
        System.out.println("Odd: " + countOfOddNumbers);
    }
}
