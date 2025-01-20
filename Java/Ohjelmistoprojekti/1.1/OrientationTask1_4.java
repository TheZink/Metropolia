import java.util.Scanner;
import java.util.LinkedList;

public class OrientationTask1_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int customer_id = 1;
        long current_time = System.currentTimeMillis();        
        LinkedList<Integer> queue = new LinkedList<Integer>();

        while (true) {
            
            try {
                System.out.println("Jonossa on nyt " + queue.size() + " asiakasta. Valitse 1) 'Laita jonoon', 2) 'Palvele pisimpään jonossa ollutta asiakasta', tai 3) jos haluat lopettaa ohjelman.");
                int promt = scanner.nextInt();
                Thread.sleep(1000);

                // Tässä lohkossa asiakasta laitetaan listan alkuun
                if (promt == 1) {
                    queue.addFirst(customer_id);
                    System.out.println("Laitoit ID:" + customer_id + " jonoon.");
                    customer_id++;
                    Thread.sleep(1000);
                } 
                
                // Tässä lohkossa poistetaan listan viimeistä asiakasta. Samalla tulostetaan jonotusaika
                else if(promt == 2) {
                    System.out.println("Palvelit ID:" + queue.getLast() + ". Hänen jonotusaika oli " + ((System.currentTimeMillis() - current_time) / 1000) + " sekunttia.");
                    queue.removeLast();
                    Thread.sleep(1000);
                } 
                
                // Tämä lohko lopettaa ohjelman
                else if (promt == 3) {
                    break;
                }
                
                // Mennään tänne, jos käyttäjä syöttää väärän vaihtoehdon
                else {
                    System.out.println("Väärä syöte. Yritä uudelleen");
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Lopetetaan ohjelma. Kiitos!");
        scanner.close();
    }
}
