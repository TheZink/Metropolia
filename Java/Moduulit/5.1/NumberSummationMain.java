import java.util.ArrayList;
import java.util.Random;

class NumberSummation extends Thread {
    private int intAmount;                                                   // Satunnaislukujen määrä             
    private int coreAmount;                                                  // Ytimien lukumäärä
    private int totalAmount;                                                 // Summa

    public NumberSummation(int intAmount, int coreAmount) {
        this.intAmount = intAmount;
        this.coreAmount = coreAmount;
        totalAmount = 0;                                                     // Alustetaan summa
    }

    public void run() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        
        // Luodaan satunnaislukuja
        for (int i = 1; i <= coreAmount; i++) {
            arrayList.add(random.nextInt(intAmount)+1);           
        }

        // Luodaan säikeet
        for (int i = 0; i < coreAmount; i++) {
            new Thread(new NumberSummation()).start();
        }
    }

    int getTotal() {
        return totalAmount;
    }
}

public class NumberSummationMain {
    public static void main(String[] args) {
        int core = Runtime.getRuntime().availableProcessors();                 // Määritetään saatavilla olevien ytimien määrä
        int amount = 100000;
        int perThreads = amount / core;                                        // Satunnaislukujen määrä

        NumberSummation summation = new NumberSummation(amount, core);
        
    }
}