package task2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    @BeforeEach
    void beforeEach(){
        System.out.println("Testi alkaa");
    }
    
    @Test
    void testConcatenate(){
        StringManipulator manipulator = new StringManipulator();
        System.out.println("Testataan concatenate");
        assertEquals("Testitoimii", manipulator.concatenate("Testi", "toimii"));
        assertEquals("Kokeillaanuudestaan", manipulator.concatenate("Kokeillaan", "uudestaan"));
    }

    @Test
    void testLength(){
        StringManipulator manipulator = new StringManipulator();
        System.out.println("Testataan findLength");
        assertEquals(5, manipulator.findLength("Testi"));
        assertEquals(5, manipulator.findLength("Ilkka"));
        assertEquals(14, manipulator.findLength("Nytonpitkäsana"));
    }

    @Test
    void testUpperCase(){
        StringManipulator manipulator = new StringManipulator();
        System.out.println("Testataan convertToUpperCase");
        assertEquals("ILKKA", manipulator.convertToUpperCase("Ilkka"));
        assertEquals("TESTI", manipulator.convertToUpperCase("Testi"));
    }

    @Test
    void testLowerCase(){
        StringManipulator manipulator = new StringManipulator();
        System.out.println("Testataan convertToLowerCase");
        assertEquals("ilkka", manipulator.convertToLowerCase("ILKKA"));
        assertEquals("testi", manipulator.convertToLowerCase("TESTI"));
    }

    @Test
    void testBoolean(){
        StringManipulator manipulator = new StringManipulator();
        System.out.println("Testataan containsSubString");
        assertTrue(manipulator.containsSubString("Ilkka", "I"));
        assertFalse(manipulator.containsSubString("Ilkka", "e"));
    }


    @AfterEach
    void AfterEach(){
        System.out.println("Testi on päättyi");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("Kaikki testit on suoritettu");
    }
}
