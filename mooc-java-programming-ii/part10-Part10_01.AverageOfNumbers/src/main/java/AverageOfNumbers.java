
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            inputs.add(input);


        }

        double average = inputs.stream().mapToInt(value -> Integer.valueOf(value)).average().getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
