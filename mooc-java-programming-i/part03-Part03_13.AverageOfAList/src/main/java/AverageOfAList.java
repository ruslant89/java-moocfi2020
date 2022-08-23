
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
            count++;
        }

        for (int num : list) {
            sum += num;
        }

        double average = (double) sum / count;

        System.out.println("Average: " + average);
        
    }
}
