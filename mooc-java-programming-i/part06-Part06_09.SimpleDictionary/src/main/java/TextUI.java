import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
                continue;
            }

            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();

                String translation = simpleDictionary.translate(word);
                String response = "Translation: " + translation;

                if (translation == null) {
                    response = "Word " + word + " was not found";
                }
                System.out.println(response);
                continue;
            }

            System.out.println("Unknown command");
        }
    }
}
