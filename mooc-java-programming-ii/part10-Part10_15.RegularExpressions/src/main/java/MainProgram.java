import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        if (checker.timeOfDay(word)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

    }
}
