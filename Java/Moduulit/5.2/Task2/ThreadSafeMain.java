import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class ThreadSafe {
    private List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());  // Luodaan synkronoitu lista, jotta useat säikeet eivät pääse muokkaamaan listaa samaan aikaan

    public ThreadSafe() {}

    public void add(Integer value) {
        synchronized(list) {
            list.add(value);
            System.out.println("Säie " + Thread.currentThread().getId() + ": Arvo lisätty " + value + " listaan");
        }
    }

    public void remove(Integer value) {
        synchronized(list){
            if (!list.contains(value)) {
                System.out.println("Säie " + Thread.currentThread().getId() +": Arvo " + value + " ei voitu poistaa. Ei ole listassa");

            } else {
                list.remove(value);
                System.out.println("Säie " + Thread.currentThread().getId() + ": Poistettu arvo " + value + " listasta");
            }
        }
    }

    public void getList(){
        synchronized(list) {
            if (list.isEmpty()) {
                 System.out.println("Säie " +Thread.currentThread().getId()+ ":Ei voitu tulostaa. Lista on tyhjä");
                 
            } else {
                System.out.println("Säie " +Thread.currentThread().getId()+ ": Tulostetaan lista:" );
                for (int item : list) {
                    System.out.print(item + " ");
                }
                System.out.println("");     
            }
        }
    }
}

public class ThreadSafeMain {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Thread> threadsList = new ArrayList<Thread>();

        int core = Runtime.getRuntime().availableProcessors();                    // Määritetään saatavilla olevien ytimien määrä
        System.out.println("Ytimien määrä: " + core);

        ThreadSafe threadSafe = new ThreadSafe();

        try {
            for (int i = 0; i < core; i++) {
                int method = random.nextInt(3);                            // Arvotaan satunnainen metodi säikeelle
                                                    
                Thread thread = new Thread(() -> {
                    switch (method) {
                        case 0: 
                            threadSafe.add(random.nextInt(1,10));
                            break;
                        case 1:
                            threadSafe.remove(random.nextInt(1,10));
                            break;
                        case 2:
                            threadSafe.getList();
                            break;
                    }
                });
                threadsList.add(thread);
            }

        } catch (Exception e) {
            System.out.println("Ohjelma kohtasi virheen: " + e);
        }


        try {
            for (Thread thread : threadsList) {                                 // Käynnistetään säikeet ja odotetaan niiden suorittamista
                thread.start();
                thread.join();
            }
        } catch (Exception e) {
            System.out.println("Ohjelma kohtasi virheen: " + e);
        }

        System.out.println("Tulostetaan lopullinen lista: ");
        threadSafe.getList();
    }
}