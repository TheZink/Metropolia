public class ManagerTest {
    public static void main(String[] args) {

        GroceryListManager listmanager = new GroceryListManager();

        // Lisätään tuotteita
        listmanager.addItem("Omena");
        listmanager.addItem("Omena");
        listmanager.addItem("Maito");

        // Etsitään tuote listasta
        System.out.println("Totuus on " + listmanager.checkItem("Omena"));

        // Tulostetaan lista
        listmanager.displayList();

        // Poistetaan tuote
        listmanager.removeItem("Kala");

        // Tulostetaan päivitetty lista
        listmanager.displayList();
    }

}
