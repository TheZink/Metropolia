public class Calculator {
    // Instance Variable
    private int currentValue;

    // Constructor
    public Calculator() {
        this.currentValue = 0;
    }

    // Methods
    public void reset() {
        this.currentValue = 0;
    }

    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed.");
        }
        this.currentValue += value;
    }

    public int getCurrentValue() {
        return this.currentValue;
    }
}
