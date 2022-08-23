
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0, max = 100;

        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.parseInt(inputParts[1]);

            if ("add".equals(command)) {
                if (first <= max && amount > 0) {
                    int tempFirst = first + amount;
                    if (tempFirst >= max) {
                        first = max;
                    } else {
                        first += amount;
                    }
                }
            }

            if ("move".equals(command)) {
                int tempFirst = first - amount;
                int tempSecond = second + amount;

                // if first container contains any liquid and the amount to be moved is more than 0 (not a negative)
                if (first > 0 && amount > 0) {
                    // check if resulting amount in first container after amount is taken is more than 0, means the amount requested
                    // is less than the amount in first container and resulting addition to second container is less than allowed max
                    // take away from first and add to second
                    if (tempFirst > 0 && tempSecond < max) {
                        first -= amount;
                        second += amount;
                        // check if resulting amount in first container after amount is taken is more than 0, means the amount requested
                        // is less than the amount in first container and resulting addition to second container makes it contain more than
                        // allowed maximum, so take away from first container and set second container to max
                    } else if (tempFirst > 0 && tempSecond > max) {
                        first -= amount;
                        second = max;
                        // after subtraction from first container it is 0 or less than 0 and second container would have
                        // less than the max allowed, we perform another check to see if amount requested is more than what
                        // is contained in first container, if so we just move whatever is in first container to second container
                        // if not we take the amount requested and then set first container to 0
                    } else if (tempFirst <= 0 && tempSecond < max) {
                        if (amount > first) {
                            second = first;
                        } else {
                            second += amount;
                        }
                        first = 0;
                    }
                }
            }

            if ("remove".equals(command)) {
                if (second > 0 && amount > 0) {
                    if (amount >= second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                }
            }

        }
    }

}
