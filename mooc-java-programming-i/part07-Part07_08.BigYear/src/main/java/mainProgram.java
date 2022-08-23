
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if ("Quit".equals(command)) {
                break;
            }

            if ("Add".equals(command)) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();

                Bird bird = new Bird(name, nameLatin);
                birds.add(bird);
            }

            if ("Observation".equals(command)) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                boolean isBird = false;
                for (int i = 0; i < birds.size(); i++) {
                    if (bird.equals(birds.get(i).getName())) {
                        birds.get(i).increaseObservations();
                        isBird = true;
                    }
                }

                if (!isBird) {
                    System.out.println("Not a bird!");
                }
            }

            if ("All".equals(command)) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if ("One".equals(command)) {
                if (birds.size() > 0) {
                    System.out.print("Bird? ");
                    String bird = scan.nextLine();

                    for (int i = 0; i < birds.size(); i++) {
                        if (bird.equals(birds.get(i).getName())) {
                            System.out.println(birds.get(i));
                        }
                    }
                }
            }

        }
    }
}
