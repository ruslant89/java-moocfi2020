
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container containerOne = new Container(0);
        Container containerTwo = new Container(0);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            }

            String[] commands = input.split(" ");
            String command = commands[0];
            int amount = Integer.parseInt(commands[1]);

            if ("add".equals(command)) {
                containerOne.add(amount);
            }

            if ("move".equals(command)) {
                int futureCapacity = containerTwo.contains() + amount;
                if (amount > containerOne.contains()) {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(containerOne.contains());
                } else if (futureCapacity < 100 && amount > 0) {
                    containerTwo.add(amount);
                    containerOne.remove(amount);
                } else if (futureCapacity > 100) {
                    containerTwo = new Container(100);

                    if (amount > 0) {
                        containerOne.remove(amount);
                    }
                }
            }

            if ("remove".equals(command)) {
                containerTwo.remove(amount);
            }

        }
    }

}
