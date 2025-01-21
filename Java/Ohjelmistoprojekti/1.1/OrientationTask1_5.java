import java.util.LinkedList;
    
class ServicePoint {
        private LinkedList<Customer> queue = new LinkedList<>(); // Asiakas-lista
        private long StartTime = System.currentTimeMillis(); // Ohjelman aloitusaika       
    
    public void addToQueue(Customer a) {
        // Lisätään asiakas listaan
        queue.addFirst(a);
    }

    public void serve() {
        while (true) {
            Customer servCustomer = remoweFromQueue();
            // Tarkastetaan, onko lista tyhjä vai ei.
            if (!queue.isEmpty()) {
                try {
                    long waitingTime = ((System.currentTimeMillis() - StartTime) / 1000); // Tarkastetaan jonotusaika ja muutetaan se sekunneiksi
                    int serve_time = (int) (Math.random() * 10 + 1) * 1000; // Luodaan satunnainen palveluaika väliltä 1-10 ja muutetaan se millisekunneiksi
                    Thread.sleep(serve_time);
                    System.out.printf("Asiakas %d palveltu %.0f sekunnissa. Hän oli jonossa %d sekunttia", servCustomer.CustomerId(), (serve_time * 0.001), waitingTime);
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("Virhe palvelussa! " + e);
                }
            } else {
                break;
            }
        }
        System.out.println("Palvelit kaikki asiakkaita");
    } 

    public Customer remoweFromQueue() {
        // Tarkastetaan, onko lista tyhjä vai ei
        if (!queue.isEmpty()) {
            return queue.removeLast();
        }
        return null;
    }
}

class Customer {
    private int customer_id = 1;

    public Customer(int customer_id) {
        this.customer_id = customer_id;
    }

    public int CustomerId() {
        return customer_id;
    }
}

// Pääohjelma
public class OrientationTask1_5 {
    public static void main(String[] args) {
        ServicePoint service = new ServicePoint();

        int customer_amount = (int) (Math.random() * 20 ) + 1; // Arpotaan asiakasmäärä 1-20

        // Luodaan asiakasmäärä. Määrä on kovakoodattu
        for (int i = 1; i <= customer_amount; i++) {
            service.addToQueue(new Customer(i));
        }
        System.out.println(customer_amount + " asiakasta luotu");
        service.serve();
    }
}