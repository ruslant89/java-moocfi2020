
import java.util.Scanner;

public class SimpleCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give the first number:");
    int number1 = Integer.valueOf(scanner.nextLine());

    System.out.println("Give the second number:");
    int number2 = Integer.valueOf(scanner.nextLine());

    int sum = number1 + number2;
    int substration = number1 - number2;
    int multiply = number1 * number2;
    double divide = (double) number1 / number2;

    System.out.println(number1 + " + " + number2 + " = " + sum);
    System.out.println(number1 + " - " + number2 + " = " + substration);
    System.out.println(number1 + " * " + number2 + " = " + multiply);
    System.out.println(number1 + " / " + number2 + " = " + divide);

  }
}
