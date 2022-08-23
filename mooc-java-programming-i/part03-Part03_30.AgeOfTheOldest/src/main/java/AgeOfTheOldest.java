
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<>();
        while (true) {

            String person = scanner.nextLine();

            if ("".equals(person)) {
                break;
            }

            String[] parts = person.split(",");
            int age = Integer.valueOf(parts[1]);
            ages.add(age);
        }

        int biggestAge = 0;
        for (int age : ages) {
            if (age > biggestAge) {
                biggestAge = age;
            }
        }

        System.out.println("Age of the oldest: " + biggestAge);
    }
}
