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
    }
       
       
        /*  // GroceryListManager_3 testi
        
        GroceryListManager_3 listmanager = new GroceryListManager_3();

        // Lisätään tuotteita
        listmanager.addItem("Omena", 3, "Hedelmä");
        listmanager.addItem("Omena", 3, "Hedelmä");
        listmanager.addItem("Maito", 5, "Maitotuote");

        // Etsitään tuote listasta
        System.out.println("Boolean-arvo on " + listmanager.checkItem("Omena"));

        // Tulostetaan lista
        listmanager.displayList();
        
        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost() + " euroa");

        // Poistetaan tuote
        listmanager.removeItem("Maito");
        listmanager.removeItem("Kala");

        // Tulostetaan päivitetty lista
        System.out.println("Tulostetaan päivitetty lista");
        listmanager.displayList();

        System.out.println("Ostoslistan kokonaishinta on: " + listmanager.calculateCost() + " euroa");
        */

        /* 
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
    }*/

    /*
        // GroceryListManager_2 testi

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
    } */
}
