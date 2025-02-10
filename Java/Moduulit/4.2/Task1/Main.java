public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test reset
        calculator.reset();
        System.out.println("Current Value after reset: " + calculator.getCurrentValue()); // Expected: 0

        // Test add
        calculator.add(5);
        System.out.println("Current Value after adding 5: " + calculator.getCurrentValue()); // Expected: 5

        // Test exception for negative value
        try {
            calculator.add(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage()); // Expected: Negative integers are not allowed.
        }

        // Test current value
        System.out.println("Current Value: " + calculator.getCurrentValue()); // Expected: 5
    }
}
