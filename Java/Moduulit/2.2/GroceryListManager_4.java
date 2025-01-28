import java.util.ArrayList;

public class GroceryListManager_4 {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();
    
    public GroceryListManager_4() {}
    
    // Iteroidaan listaa ja tarkastetaan, onko tuote listassa. 
    // Jos epätosi, tuote lisätään listaan.
    void addItem(String name, double price, String category, double quantity) {
        
        for (GroceryItem item : groceryList) {
            if (item.getName().equals(name)) {
                System.out.println(name + " on jo listalla");
                return;
            }
        }
        groceryList.add(new GroceryItem(name, price, category, quantity));
        System.out.println(name + " lisätty listaan.");
    }
    
    // Iteroidaan listaa ja etsitään poistettava alkio.
    void removeItem(String name) {
        for (int i = 0; i < groceryList.size(); i++) {
            if (groceryList.get(i).getName().equals(name)) {
                groceryList.remove(i);
                System.out.println(name + " poistettiin listalta.");
            }
        }
    }
    
    // Iteroidaan listaa ja etsitään päivitettävä alkio
    void updateQuantity(String name, int newQuantity) {
        for (GroceryItem item: groceryList) {
            if (item.getName().equals(name)) {
                item.setQuantity(item.getQuantity() + newQuantity);
                return;
            }
        }
    }
    
    // Tulostetaan lista
    void displayList() {
        for (GroceryItem item : groceryList) {
            if (!groceryList.isEmpty()) {
                if (item.getQuantity() > 0 ) {
                    System.out.printf("%s %.0f kappaletta. Tuote kuuluu %s kategoriaan ja kappalehinta on %.2f euroa\n", item.getName(), item.getQuantity(), item.getCategory(), item.getPrice());
                }
            }
        }
    }

    // Iteroidaan lista ja tarkistetaan, onko tuote listassa. 
    // Palautetaan boolean-arvo
    boolean checkItem(String name) {
        for (GroceryItem item : groceryList) {
            if (item.getName() == name) {
                return true;
            }
        }
        return false;
    }

    // Lasketaan ostoslistan yhteissumman
    double calculateCost() {
        double total = 0;
        for (GroceryItem item : groceryList) {
            total = total + (item.getPrice() * item.getQuantity());
        }
        return total;

    }

}
