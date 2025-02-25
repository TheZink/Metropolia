package controller;

import model.Dictionary;
import view.DictionaryView;

public class DictionaryController {
    private Dictionary dictionary = new Dictionary();
    private DictionaryView view = new DictionaryView();

    public void addWord(String word, String meaning) {
        System.out.println("Kontrollerin Addword: " + word + " " + meaning);
        dictionary.addWord(word, meaning);
    }

    public String getMeaning(String word) {
        System.out.println("Kontrollerin Getmeaning: " + word);
        return dictionary.getMeaning(word);
    }
}