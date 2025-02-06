import java.util.ArrayList;
import java.util.Random;

public class NumberSummation extends Thread{
    private static int intAmount = 10000;                                           // Kovakoodataan listan kokoa
    private static int coreAmount = Runtime.getRuntime().availableProcessors();     // Haetaan säikeiden määrä
    private static int totalAmount = 0;                                             // Säikeiden tulokset

    
    public NumberSummation() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();

        int coreMath = intAmount / coreAmount;
        
        // Luodaan satunnaisluku 1-100
        for (int i = 1; i <= intAmount; i++) {
            arrayList.add(random.nextInt(100)+1);           
        }       
    }

    int getSum() {
        return totalAmount;
    }
}