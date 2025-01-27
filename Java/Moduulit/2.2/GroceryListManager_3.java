import java.util.HashMap;

public class GroceryListManager_3 {
    // private ArrayList<String> groceryList = new ArrayList<String>();
    private HashMap<String, Double> groceryList_price = new HashMap<>(); // Lista sisältää tuotteen nimen ja hinnan
    private HashMap<String, String> groceryList_category = new HashMap<>(); // Lista sisältää tuotteen nimen ja kategorian

    public GroceryListManager_3() {
    }

    // Lisätään esine listaan
    void addItem(String item, double cost, String category) {
        
        if (!groceryList_price.containsKey(item) && !groceryList_category.containsKey(item)){
            groceryList_price.put(item, cost); // Lisätään tuote ja hinta listaan
            groceryList_category.put(item, category); // Lisätään tuote ja kategoria listaan
        } else {
            System.out.println(item + " on jo listalla");
        }
    }

    // Poistetaan esine listasta
    void removeItem(String item) {
        if (groceryList_price.containsKey(item) && !groceryList_category.containsKey(item)) {
            groceryList.remove(item);
        } else {
            System.out.println(item + " ei ole ostoslistassa");
        }
    }

    // Tulostetaan lista
    void displayList() {
        for (String item : groceryList.keySet()) {
            System.out.println("Esine " + item + " maksaa " + groceryList.get(item));
        }
    }

    // Palautetaan boolean-arvo, onko esine listassa
    boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    double calculateCost() {
        double total = 0;

        for (String item : groceryList.keySet()) {
            total = total + groceryList.get(item);
        }

        return total;

    }
}
