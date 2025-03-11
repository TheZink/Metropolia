import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class ShoppingCartTest {
    private static ShoppingCart cart;

    @BeforeAll
    public static void BeforeAll() {
        System.out.println("Starting tests...");
        cart = new ShoppingCart();
    }

    @Test
    public void testAddItem() {
        System.out.println("Running AddItem...");
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        
        assertEquals(2, cart.getItemCount());
    }
    
    @Test
    public void testRemoveItem() {
        System.out.println("Running RemoveItem..."); 

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");
        
        assertEquals(1, cart.getItemCount());
    }
    
    @Test
    public void testCalculateTotal() {
        System.out.println("Running CalculateTotal...");  

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
        
        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }

    @AfterEach
    public void AfterEach() {
        System.out.println("Test finished.");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("All tests finished.");
    }
}
