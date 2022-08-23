
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();

            if ("".equals(text)) {
                break;
            } else {
                String[] words = text.split(" ");

                for (String word : words) {
                    if (word.contains("av")) {
                        System.out.println(word);
                    }
                }

//                for (int i = 0; i < words.length; i++) {
//                    if (words[i].contains("av")) {
//                        System.out.println(words[i]);
//                    }
//                }
            }
        }
    }
}
