import java.util.*;

public class Calculate {
    public static void main(String[] arg){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));

        Double result = numbers.stream().mapToDouble(x -> (double) x).sum();
        long  result2 = numbers.stream().count();

        System.out.println(result / result2);
    }
}
