import java.util.HashMap;

public class GroceryListManager_2 {
    // private ArrayList<String> groceryList = new ArrayList<String>();
    private HashMap<String, Double> groceryList = new HashMap<>();

    public GroceryListManager_2() {
    }

    // Lisätään esine listaan
    void addItem(String item, double cost) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item,cost);
        } else {
            System.out.println(item + " on jo listalla");
        }
    }

    // Poistetaan esine listasta
    void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
        } else {
            System.out.println(item + " ei ole ostoslistassa");
        }
    }

    // Tulostetaan lista
    void displayList() {
        for (String item: groceryList.keySet()) {
            System.out.println("Esine " + item + " maksaa " + groceryList.get(item));
        }
    }

    // Palautetaan boolean-arvo, onko esine listassa
    boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    double calculateCost(){
        double total = 0;

        for (String item : groceryList.keySet()) {
            total = total + groceryList.get(item);
        }

        return total;
         
    }
}
