package model;

import java.util.HashMap;

public class Dictionary {
    private static HashMap<String, String> dictionary = new HashMap<>();
    private String word;
    private String meaning;

    public void addWord() {}

    public String getMeaning(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return "Word not found";
        }
    }

    public void addWord(String word, String meaning) {
        dictionary.put(word, meaning);
    }

}
