public class ManagerTest {
    public static void main(String[] args) {

        // GroceryListManager_2 testi
        
        GroceryListManager_2 listmanager = new GroceryListManager_2();

        // Lisätään tuotteita
        listmanager.addItem("Omena", 3);
        listmanager.addItem("Omena", 3);
        listmanager.addItem("Maito", 5);

        // Etsitään tuote listasta
        System.out.println("Totuus on " + listmanager.checkItem("Omena"));

        // Tulostetaan lista
        listmanager.displayList();

        // Poistetaan tuote
        listmanager.removeItem("Kala");

        // Tulostetaan päivitetty lista
        listmanager.displayList();

        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost());

        // GroceryListManager_1 testi
    }

}
