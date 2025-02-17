import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class NumberSummation implements Runnable {
    private static int totalAmount = 0;                             // Loppusumma
    private List<Integer> numbers;                                  // Lista luvuista
    private int start;                                              // Säikeen aloituskohta
    private int end;                                                // Säikeen loppukohta

    public NumberSummation(int start, int end, List<Integer> numbers) {
        this.start = start;
        this.end = end;
        this.numbers = numbers;
    }

    public void run() {
        System.out.println("Säie " + Thread.currentThread().getId() + " Alku: " + start + ", loppu: " + end);
        int amount = 0;
        
        try {                                                     
            for (int i = 0; i < numbers.size(); i++) {                   // Lasketaan summa ja lisätään se amount-muuttujaan
                amount += numbers.get(i);
            }
            totalAmount += amount;                                       // Lisätään säikeen summa loppusummaan
        } catch (Exception e) {
            System.out.println("Ohjelma kohtasi virheen: " + e);
        }
    }
           
    int getTotal() {
        return totalAmount;
    }
}

public class NumberSummationMain {
    public static void main(String[] args) {
        int core = Runtime.getRuntime().availableProcessors();                           // Määritetään saatavilla olevien ytimien määrä
        int amount = 100000000;                                                          // Satunnaislukujen määrä
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        ArrayList<Thread> threadsList = new ArrayList<Thread>();

        Random random = new Random();                                               
                
        for (int i = 1; i <= amount; i++) {                                             // Luodaan satunnaislukuja  
            numberList.add(random.nextInt(10000) + 1);           
        }
        
        int perThreads = numberList.size() / core;                                      // Yhden säikeen käsittelemien lukujen määrä                                       

        try{
            for (int i = 0; i < core; i++) {                                            // Luodaan säikeet ja lisätään ne listaan
                int start = i * perThreads;
                int end = (i + 1) * perThreads;

                List<Integer> numbers = numberList.subList(start, end);                 // Luodaan lista luvuista, jotka säie käsittelee

                Thread thread = new Thread(new NumberSummation(start, end, numbers));
                threadsList.add(thread);                                                // Lisätään säie listaan
            }
        } catch (Exception e) {
            System.out.println("Ohjelma kohtasi virheen: " + e);
        }



        for (Thread thread: threadsList) {                                              // Käynnistetään säikeet ja odotetaan niiden suorittamista
            try {
                thread.start();
                thread.join();
            } catch (Exception e) {
                System.out.println("Ohjelma kohtasi virheen: " + e);
            }
        }

        System.out.println("Loppusumma: " + new NumberSummation(0, 0, numberList).getTotal());
    }
}