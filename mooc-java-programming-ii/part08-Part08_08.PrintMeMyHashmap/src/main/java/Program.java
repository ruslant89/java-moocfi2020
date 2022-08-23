
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        ArrayList<String> keys = new ArrayList<>();
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                keys.add(key);
            }
        }

        for (String k : keys) {
            System.out.println(k);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        ArrayList<String> values = new ArrayList<>();
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                values.add(hashmap.get(key));
            }
        }

        for (String v : values) {
            System.out.println(v);
        }
    }
}
