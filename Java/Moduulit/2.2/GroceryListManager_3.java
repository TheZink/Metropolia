import java.util.ArrayList;

public class GroceryListManager_3 {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>(); // Lista sisältää tuotteen nimen, hinnan ja kategorian

    public GroceryListManager_3() {}

    // Iteroidaan listaa ja tarkastetaan, onko tuote listalla. Jos epätosi, tuote lisätään listaan.
    void addItem(String name, double price, String category, double quantity) {
    
        for (GroceryItem item: groceryList) {             
            if (item.getName().equals(name)) { 
                System.out.println(name + " on jo listalla");
                return;
            }
        }
        groceryList.add(new GroceryItem(name, price, category, quantity));
        System.out.println(name + " lisätty listaan.");
    }

    // Iteroidaan listaa ja etsitään poistettava tuote.
    void removeItem(String name) {
        for (int i = 0; i < groceryList.size(); i++) {
            if (groceryList.get(i).getName().equals(name)) {
                groceryList.remove(i);
                System.out.println(name + " poistettiin listalta.");
            }
       }
    }

    // Tulostetaan lista
    void displayList() {
        for (GroceryItem item : groceryList) {
            if (!groceryList.isEmpty()) {
                System.out.println(item.getName() + " maksaa " + item.getPrice() + " euroa ja se kuuluu " + item.getCategory() + " kategoriaan.");
            }
        }
    }

    // Iteroidaan lista ja tarkistetaan, onko tuote listalla. Palautetaan boolean-arvo
    boolean checkItem(String name) {
        for (GroceryItem item: groceryList) {
            if (item.getName() == name) {
                return true;
            }
        }
       return false;
    }

    // Lasketaan ostoslistan yhteissumman
    double calculateCost() {
        double total = 0;

        for (GroceryItem item: groceryList) {
            total = total + item.getPrice();
        }
        return total;

    }
}

    
