import java.util.*;

public class Collection {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));
        final int[] sum = {0};
    
        numbers.removeIf(n -> n % 2 == 0); // To remove a even numbers
        numbers.replaceAll(n -> n * 2); // double a value of odd numbers
        numbers.forEach(n -> sum[0] += n); // calculate all numbers in the list
        
        System.out.println(sum[0]);
    }
}
