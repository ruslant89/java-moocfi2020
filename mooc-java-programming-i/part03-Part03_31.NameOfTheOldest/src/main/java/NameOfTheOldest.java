
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> persons = new ArrayList<>();
        while (true) {
            String person = scanner.nextLine();

            if ("".equals(person)) {
                break;
            }

            persons.add(person);
        }

        String nameOfOldestPerson = "";
        int biggestAge = 0;
        for (String person : persons) {
            String[] parts = person.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age > biggestAge) {
                biggestAge = age;
                nameOfOldestPerson = parts[0];
            }
        }

        System.out.println("Name of the oldest: " + nameOfOldestPerson);
    }
}
