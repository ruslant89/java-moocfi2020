
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> people = new ArrayList<>();
        while (true) {
            String person = scanner.nextLine();

            if ("".equals(person)) {
                break;
            }

            people.add(person);
        }

        String longestName = "";
        int sum = 0;
        int count = 0;
        for (String person : people) {
            String[] parts = person.split(",");

            if (parts[0].length() > longestName.length()) {
                longestName = parts[0];
            }

            int year = Integer.valueOf(parts[1]);

            sum += year;
            count++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double)sum / count);
    }
}
