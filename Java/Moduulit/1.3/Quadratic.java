import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna 3 lukua. Erottele luvut välilyönnillä");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        // Lasketaan diskriminantti
        double d = Math.pow(b, 2) - 4 * a * c;

        // Tarkastetaan, onko kaavassa kaksi, yksi vai ei yhtään reaalijuurta.
        // Samalla tarkastetaan, ettei a ole 0.

        if (d > 0 && a != 0) {
            double x1 = (-(b) + d) / 2 * a;
            double x2 = (-(b) - d) / 2 * a;
            System.out.println("Kaavassa on kaksi reaalijuurta. x1 on " + x1 + " ja x2 on " + x2);
        } else if (d == 0 && a != 0) {
            double x3 = -(b) / 2 * a;
            System.out.println("Kaavassa on vain yksi reaalijuuri. X on " + x3);
        } else {
            System.out.println("Kaavassa ei ole yhtään reaalijuurta.");
        }
        scanner.close();
    }
}