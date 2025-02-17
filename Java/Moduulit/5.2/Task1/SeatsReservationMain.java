import java.util.ArrayList;
import java.util.Random;

class SeatsReservation implements Runnable{
    private static int seats = 20;
    private int amount;
    
    public SeatsReservation(int amount) {
        this.amount = amount;
    }

    public void run() {
        synchronized(SeatsReservation.class) {      // Lukitaan luokka, jotta vain yksi säie voi suorittaa koodia kerrallaan
            if (seats >= amount) {
                seats = seats - amount;
                System.out.println("Asiakas " + Thread.currentThread().getId() + " varasi " + amount + " paikkaa. Jäljellä olevia paikkoja: " + seats);            
            } else {
                System.out.println("Asiakas " + Thread.currentThread().getId() + " ei voinut varata " + amount + " paikkaa.");
            }
       }
    }
}        

public class SeatsReservationMain {
    public static void main(String[] args) {
        Random random = new Random();
              
        ArrayList<Thread> threadsList = new ArrayList<Thread>();                             

        int core = Runtime.getRuntime().availableProcessors();                  // Määritetään saatavilla olevien ytimien määrä
        System.out.println("Ytimien määrä: " + core);

        try {
            for (int k = 0; k < core; k++) {
                int reserve = random.nextInt(1,6);                 // Arvotaan satunnainen luku väliltä 1-5                                                
                Thread thread = new Thread(new SeatsReservation(reserve));      // Luodaan säie
                threadsList.add(thread);                                        // lisätään säie listaan
            }
        } catch (Exception e) {
            System.out.println("Ohjelma kohtasi virheen: " + e);
        }

        try {
            for (Thread thread: threadsList) {                                  // Käynnistetään säikeet ja odotetaan niiden suorittamista
                thread.start();
                // thread.join();
            }
        } catch (Exception e) {
            System.out.println("Ohjelma kohtasi virheen: " + e);
        }
    }
}
