import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> map = new HashMap<>();

    public DictionaryOfManyTranslations() {
    }

    public void add(String word, String translation) {
        ArrayList<String> strings;
        if (map.containsKey(word)) {
            strings = map.get(word);
        } else {
            strings = new ArrayList<>();
        }
        strings.add(translation);
        map.put(word, strings);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> strings;
        if (map.containsKey(word)) {
            strings = map.get(word);
        } else {
            strings = new ArrayList<>();
        }
        return strings;
    }

    public void remove(String word) {
        map.remove(word);
    }
}
