public class ManagerTest {
    public static void main(String[] args) {

       // GroceryListManager_4 testi
       GroceryListManager_4 listmanager = new GroceryListManager_4();

        // Lisätään tuotteita
        listmanager.addItem("Omena", 3, "Hedelmä", 2);
        listmanager.addItem("Maito", 5, "Maitotuote", 1);

        // Etsitään tuote listasta
        System.out.println("Boolean-arvo on " + listmanager.checkItem("Omena"));

        // Tulostetaan lista
        listmanager.displayList();
        
        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost() + " euroa");

        // Poistetaan tuote
        listmanager.removeItem("Maito");

        // Päivitetään tuotteen määrä
        listmanager.updateQuantity("Omena", 3);

        // Tulostetaan päivitetty lista
        System.out.println("Tulostetaan päivitetty lista");
        listmanager.displayList();

        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost() + " euroa");
       
       
        // GroceryListManager_3 testi
        
        GroceryListManager_3 listmanager3 = new GroceryListManager_3();

        // Lisätään tuotteita
        listmanager3.addItem("Omena", 3, "Hedelmä", 0);
        listmanager3.addItem("Omena", 3, "Hedelmä", 0);
        listmanager3.addItem("Maito", 5, "Maitotuote", 0);

        // Etsitään tuote listasta
        System.out.println("Boolean-arvo on " + listmanager.checkItem("Omena"));

        // Tulostetaan lista
        listmanager3.displayList();
        
        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost() + " euroa");

        // Poistetaan tuote
        listmanager3.removeItem("Maito");
        listmanager3.removeItem("Kala");

        // Tulostetaan päivitetty lista
        System.out.println("Tulostetaan päivitetty lista");
        listmanager3.displayList();

        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost() + " euroa");
    

    
        // GroceryListManager_2 testi

        GroceryListManager_2 listmanager2 = new GroceryListManager_2();

        // Lisätään tuotteita
        listmanager2.addItem("Omena", 3);
        listmanager2.addItem("Omena", 3);
        listmanager2.addItem("Maito", 5);

        // Etsitään tuote listasta
        System.out.println("Totuus on " + listmanager.checkItem("Omena"));

        // Tulostetaan lista
        listmanager2.displayList();

        // Poistetaan tuote
        listmanager2.removeItem("Kala");

        // Tulostetaan päivitetty lista
        listmanager2.displayList();

        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost());
    


        // GroceryListManager_1 testi

        GroceryListManager_1 listmanager1 = new GroceryListManager_1();

        // Lisätään tuotteita
        listmanager1.addItem("Omena");
        listmanager1.addItem("Omena");
        listmanager1.addItem("Maito");

        // Etsitään tuote listasta
        System.out.println("Totuus on " + listmanager.checkItem("Omena"));

        // Tulostetaan lista
        listmanager1.displayList();

        // Poistetaan tuote
        listmanager1.removeItem("Kala");

        // Tulostetaan päivitetty lista
        listmanager1.displayList();
    }
}
