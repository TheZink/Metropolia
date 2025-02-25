package model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public String getMeaning(String word) {
        System.out.println("Dictionary getMeaning: " + word);
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return "Sanaa ei löytynyt";
        }
    }

    public void addWord(String word, String meaning) {
        System.out.println("Dictionary addWord: " + word + " " + meaning);

        dictionary.put(word, meaning);
    }

}
