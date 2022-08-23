import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        ArrayList<String> translations = new ArrayList<>();
        translations.add(translation);

        if (this.dictionary.containsKey(word)) {
            this.dictionary.get(word).add(translation);
        } else {
            this.dictionary.put(word, translations);
        }
    }

    public ArrayList<String> translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
