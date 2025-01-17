import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Syötä kaksi alku ja loppu lukua:");
        int start = scanner.nextInt(), end = scanner.nextInt();
        boolean flag = true;

        // Käydään numerot läpi alusta loppuun
        for (int i = start; i < end; i++) {

            // Tarkistetaan, onko luku alle 2
            if (i <= 1) {
                flag = false;
            }
            // Tarkistetaan, onko luku 2
            else if (i == 2) {
                flag = true;
            }
            // Tarkistetaan, onko luku jaollinen
            else if (i % 2 == 0) {
                flag = false;
            }
            // Tarkistetaan luvun jaollisuus muilla luvuilla
            else {
                flag = true;
                for (int j = 3; j * j <= i; j += 2) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
