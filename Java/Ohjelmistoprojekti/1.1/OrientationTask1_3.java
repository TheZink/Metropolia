import java.util.Scanner;

public class OrientationTask1_3 {
    public static void main(String[] args) {
        int customer_id = 0;
        long customer_start_time = 0;
        long customer_end_time = 0;
        long shift = System.currentTimeMillis();
        boolean served = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Montako asiakasta haluat palvella tänään?");
        int times = Integer.parseInt(scanner.nextLine());
        
        try {
            for (int i = 1; i <= times; i++) {
                
                // Luodaan asiakkaan id ja saapumisaika. Aika määritetään millisekuntteina
                if (customer_id == 0) {
                    customer_id = i;
                    customer_start_time = System.currentTimeMillis();
                    System.out.println("Asiakas " + customer_id + " saapui jonoon");
                    Thread.sleep(5000);
                }
                
                // Tarkastetaan, onko asiakasta palveltu. Jos tosi, niin luodaan uusi asiakas ja saapumisaika
                if (served) {
                    customer_id = i;
                    customer_start_time = System.currentTimeMillis();
                    served = false;
                    System.out.println("Asiakas " + customer_id + " saapui jonoon");
                    Thread.sleep(5000);
                }
                
                System.out.println("Haluatko palvella asiakasta nyt? Kirjoita 'yes' tai 'no'");
                String promt = scanner.nextLine();
                
                // Jos käyttäjä syöttää yes, niin tulostetaan käyttäjälle jonotusaika
                if (promt.equalsIgnoreCase("yes")) {

                    served = true;
                    System.out.println("Palvellaan asiakasta");
                    Thread.sleep(5000);
                    customer_end_time = System.currentTimeMillis();
                    long time_in_queue = (customer_end_time - customer_start_time) / 60000; // Muutetaan aika minuuteiksi
                    
                    System.out.println("Palvelit asiakasta " + customer_id + ". Hänen jonotusaika oli " + time_in_queue + " minuuttia.");
                    Thread.sleep(5000);
                } 
                // Jos käyttäjä syöttää no, niin kulutetaan aikaa
                else {
                    System.out.println("Menit hakemaan kahvia. Päätit kuluttaa aikaa");
                    Thread.sleep(10000);
                }
            }
            if (!served) {
                System.out.println("Työaikasi päättyi.");
                Thread.sleep(2000);
                System.out.println("Jonossa oli yksi asiakas. Hänen jonotusaika oli " + ((customer_start_time - System.currentTimeMillis()) / 60000) + " minuuttia.");
                Thread.sleep(2000);
                System.out.println("Työaikasi oli " + (System.currentTimeMillis() - shift) / 60000 + " minuuttia");
            } else {
                System.out.println("Työaikasi päättyi.");
                Thread.sleep(2000);
                System.out.println("Työaikasi oli " + (shift - System.currentTimeMillis()) / 60000 + " minuuttia");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        scanner.close();
    }
}
