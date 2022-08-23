
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 100;

        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.parseInt(inputParts[1]);

            if ("add".equals(command)) {
                containerOne.add(amount);
            }

            if ("move".equals(command)) {
                int tempFirst = containerOne.contains() - amount;
                int tempSecond = containerTwo.contains() + amount;

                // if first container contains any liquid and the amount to be moved is more than 0 (not a negative)
                if (containerOne.contains() > 0 && amount > 0) {
                    // check if resulting amount in first container after amount is taken is more than 0, means the amount requested
                    // is less than the amount in first container and resulting addition to second container is less than allowed max
                    // take away from first and add to second
                    if (tempFirst > 0 && tempSecond < max) {
                        containerOne.remove(amount);
                        containerTwo.add(amount);

                        // check if resulting amount in first container after amount is taken is more than 0, means the amount requested
                        // is less than the amount in first container and resulting addition to second container makes it contain more than
                        // allowed maximum, so take away from first container and set second container to max
                    } else if (tempFirst > 0 && tempSecond > max) {
                        containerOne.remove(amount);
                        containerTwo = new Container(100);

                        // after subtraction from first container it is 0 or less than 0 and second container would have
                        // less than the max allowed, we perform another check to see if amount requested is more than what
                        // is contained in first container, if so we just move whatever is in first container to second container
                        // if not we take the amount requested and then set first container to 0
                    } else if (tempFirst <= 0 && tempSecond < max) {
                        if (amount > containerOne.contains()) {
                            containerTwo.add(containerOne.contains());
                        } else {
                            containerTwo.add(amount);
                        }
                        containerOne = new Container(0);
                    }
                }
            }

            if ("remove".equals(command)) {
                containerTwo.remove(amount);
            }
        }
    }
}
