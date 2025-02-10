Copilot oli luonut pyynnöstäni yhden luokan, jossa laskimen toiminnot. Laskin tällä hetkellä laskee summan.


```java
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
```
Alla copilotin kertomus ohjelmasta

This Java file defines a Calculator class with the following features:

Instance Variable: currentValue: An integer to store the current value of the calculator.

Constructor: 

Calculator(): Initializes currentValue to 0.

Methods:

reset(): Resets currentValue to 0.
add(int value): Adds a non-negative integer to currentValue. Throws an IllegalArgumentException if the input value is negative.
getCurrentValue(): Returns the current value of the calculator.



