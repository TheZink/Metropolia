import java.util.ArrayList;

class GroceryListManager_1 {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public GroceryListManager_1() {
    }

    // Lisätään esine listaan
    void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        } else {
            System.out.println(item + " on jo listalla");
        }
    }

    // Poistetaan esine listasta
    void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
        } else {
            System.out.println(item + " ei ole ostoslistassa");
        }
    }

    // Tulostetaan lista
    void displayList() {
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    // Palautetaan boolean-arvo, onko esine listassa
    boolean checkItem(String item) {
        return groceryList.contains(item);
    }
}