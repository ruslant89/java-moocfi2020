
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        ArrayList<String> person = new ArrayList<>();

        try (Scanner fileInput = new Scanner(Paths.get(file))) {
            while (fileInput.hasNextLine()) {
                person.add(fileInput.nextLine());
            }

            for (String line : person) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
