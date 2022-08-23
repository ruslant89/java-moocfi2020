package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) {
            this.dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (word.equals(this.dictionary.get(key))) {
                    return key;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else if (this.dictionary.containsValue(word)) {
            this.dictionary.keySet().removeIf(s -> word.equals(this.dictionary.get(s)));
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                String word = parts[0];
                String translation = parts[1];
                add(word, translation);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String word : this.dictionary.keySet()) {
                writer.println(word + ":" + this.dictionary.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
