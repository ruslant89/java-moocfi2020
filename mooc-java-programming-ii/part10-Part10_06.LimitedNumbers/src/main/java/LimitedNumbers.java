
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);

            if (num < 0) {
                break;
            }

            numbers.add(num);
        }

        numbers.stream().filter(n -> n >= 0 && n <= 5).forEach(num -> System.out.println(num));

    }
}
