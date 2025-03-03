package module;

import java.util.HashMap;

public class Notebook {
    private HashMap<String, String> notes = new HashMap<String, String>();

    public Notebook() {}

    public void setNote(String title, String content) {
        notes.put(title, content);
    }
    
    public String getNote(String title) {
        if (!notes.containsKey(title)) {
            return "Muistiinpanoa ei löytynyt";
        } else {
            return notes.get(title);
        }
    }
}


