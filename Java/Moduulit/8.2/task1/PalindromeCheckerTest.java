import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    private static PalindromeChecker checker;

    @BeforeAll
    public static void setUp() {
        System.out.println("Setting up...");
        checker = new PalindromeChecker();
    }

    @Test
    public void testIsPalindromeTest1() {
        System.out.println("Testing radar");
        assertTrue(checker.isPalindrome("radar"));
      }

    @Test
    public void testIsPalindromeTest2() {
        System.out.println("Testing saippuakivikauppias");
        assertTrue(checker.isPalindrome("saippuakivikauppias"));
    }

    @Test
    public void testIsPalindromeTest3() {
        System.out.println("Testing A man, a plan, a canal, Panama");
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
    }

    @Test
    public void testIsPalindromeTest4() {
        System.out.println("Testing hello");
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeTest5() {
        System.out.println("Testing openai");
        assertFalse(checker.isPalindrome("openai"));
    }

    @AfterEach
    public void AfterEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("All tests completed");
    }

}