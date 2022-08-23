
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        // we create a scanner for reading the file
        try (Scanner input = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
