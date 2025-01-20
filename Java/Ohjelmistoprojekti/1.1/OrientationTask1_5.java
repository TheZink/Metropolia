import java.util.LinkedList;
    
class ServicePoint {
        private LinkedList<Customer> queue = new LinkedList<>();       
    
    public void addToQueue(Customer a) {
        // Lisätään asiakas listaan
        queue.addFirst(a);
        System.out.println("Asiakas " + a.CustomerId() + " lisätty listaan");
    }

    public void serve() {
        while (true) {
            Customer servCustomer = remoweFromQueue();
            // Tarkastetaan, onko lista tyhjä vai ei.
            if (!queue.isEmpty()) {
                try {
                    // Luodaan satunnainen odotusaika väliltä 1-10 ja muutetaan se millisekunneiksi
                    int serve_time = (int) (Math.random() * 10 + 1) * 1000;
                    Thread.sleep(serve_time);
                    System.out.printf("Asiakas %d palveltu %.0f sekunnissa.", servCustomer.CustomerId(), (serve_time * 0.001));
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

public class OrientationTask1_5 {
    public static void main(String[] args) {
        ServicePoint service = new ServicePoint();

        // Luodaan asiakasmäärä. Määrä on kovakoodattu
        for (int i = 1; i <= 10; i++) {
            service.addToQueue(new Customer(i));
        }
        service.serve();
    }
}