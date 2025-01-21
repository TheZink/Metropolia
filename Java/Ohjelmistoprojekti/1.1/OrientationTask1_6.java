import java.util.LinkedList;

class ServicePoint_2 {
    private LinkedList<Customer> queue = new LinkedList<>(); // Asiakas-lista
    private LinkedList<Integer> service_time = new LinkedList<>(); // Lista palveluajoille
    private long StartTime = System.currentTimeMillis(); // Ohjelman aloitusaika
    private long average_time = 0;

    public void addToQueue(Customer a) {
        queue.addFirst(a); // Lisätään asiakas listaan
    }

    public void serve() {

        while (true) {
            Customer servCustomer = remoweFromQueue();

            // Tarkastetaan, onko lista tyhjä vai ei.
            if (!queue.isEmpty()) {
                try {
                    long waitingTime = ((System.currentTimeMillis() - StartTime) / 1000); // Tarkastetaan jonotusaika ja muutetaan se sekunneiksi
                    int serve_time = (int) (Math.random() * 10 + 1) * 1000; // Luodaan satunnainen palveluaika väliltä 1-10 ja muutetaan se millisekunneiksi
                    service_time.addFirst(serve_time); // Lisätään palveluaika listaan
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

        for (long time : service_time) {
            average_time = average_time + time;
        }

        System.out.printf("Keskimääräinen palveluaika oli %d sekunttia", ((average_time / 1000) / service_time.size()));
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
    private int customer_id;

    public Customer(int customer_id) {
        this.customer_id = customer_id;
    }

    public int CustomerId() {
        return customer_id;
    }
}

// Pääohjelma
public class OrientationTask1_6 {
    public static void main(String[] args) {
        ServicePoint_2 service = new ServicePoint_2();

        int customer_amount = (int) (Math.random() * 20) + 1; // Arpotaan asiakasmäärä 1-20

        // Luodaan asiakasmäärä. Määrä on kovakoodattu tällä hetkellä
        for (int i = 1; i <= customer_amount; i++) {
            service.addToQueue(new Customer(i));
        }
        System.out.println(customer_amount + " asiakasta luotu");
        service.serve();
    }
}