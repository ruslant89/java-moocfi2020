
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int containerOne = 0;
        int containerTwo = 0;

        int maxCapacity = 100;

        while (true) {

            System.out.println("First: " + containerOne + "/" + maxCapacity);
            System.out.println("Second: " + containerTwo + "/" + maxCapacity);

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            }

            String[] commands = input.split(" ");
            String command = commands[0];
            int amount = Integer.parseInt(commands[1]);

            if ("add".equals(command)) {
                int futureCapacity = containerOne + amount;
                if (futureCapacity < maxCapacity && amount > 0) {
                    containerOne += amount;
                } else {
                    containerOne = maxCapacity;
                }

            }

            if ("move".equals(command)) {
                int futureCapacity = containerTwo + amount;
                if (amount > containerOne) {
                    containerTwo += containerOne;
                    containerOne -= containerOne;
                } else if (futureCapacity < maxCapacity && amount > 0) {
                    containerTwo += amount;
                    containerOne -= amount;
                } else if (futureCapacity > maxCapacity) {
                    containerTwo = maxCapacity;

                    if (amount > 0) {
                        containerOne -= amount;
                    }
                }
            }

            if ("remove".equals(command)) {
                int futureCapacity = containerTwo - amount;
                if (containerTwo >= amount) {
                    containerTwo -= amount;
                } else if (futureCapacity < amount) {
                    containerTwo = 0;
                } else {
                    containerTwo -= amount;
                }
            }

        }
    }

}
