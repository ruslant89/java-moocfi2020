
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("First");
        words.add("Second");
        words.add("Third");

        System.out.println(words);

        removeLast(words);
        removeLast(words);

        System.out.println(words);
    }

    public static void removeLast(ArrayList<String> words) {

        if (words.size() == 0) {
            return;
        }

        words.remove(words.size() - 1);
    }

}
