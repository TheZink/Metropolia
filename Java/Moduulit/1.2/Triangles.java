import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kysytään käyttäjältä a-kateetin pituus
        System.out.println("Syötä viereisen kateetin pituus: ");
        double a = scanner.nextDouble();

        // Kysytään käyttäjältä b-kateetin pituus
        System.out.println("Syötä vastaisen kateetin pituus: ");
        double b = scanner.nextDouble();

        // Lasketaan kateetit Pythagoraan lauseella
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Tulostetaan suorakulmion hypotenuusan pituus
        System.out.printf("Hypotenuusan pituus on %.0f ", c);
        scanner.close();
    }
}
