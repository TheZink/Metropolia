import java.util.*;
import java.util.stream.*;

public class Filtering {
    public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            List <Integer> filtered = numbers.stream().filter(n -> n % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
            int sum = filtered.stream().mapToInt(x -> x).sum();

            System.out.println(filtered);
            System.out.println(sum);
        }

}
