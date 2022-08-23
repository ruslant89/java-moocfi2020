
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String text = scanner.nextLine();

            if ("".equals(text)) {
                break;
            }

            String[] words = text.split(" ");

            System.out.println(words[words.length - 1]);
        }
    }
}
