package controller;

import model.Dictionary;
import view.DictionaryView;

public class DictionaryController {
    private Dictionary dictionary;
    private DictionaryView view;

    public DictionaryController(Dictionary dictionary, DictionaryView view) {
        this.dictionary = dictionary;
        this.view = view;
    }

    public void cast() {
    }


}
