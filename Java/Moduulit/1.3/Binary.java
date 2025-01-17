import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Syötä binääriluku:");
        String bin = scanner.next();
        double result = 0;

        // Iteroidaan String oikealta vasemalle ja lasketaan bitti kerrallaan
        for (int i = 0; i < bin.length(); i++) {

            // Haetaan merkkijono ja lasketaan se. Muutetaan samalla int-muotoon
            int conv = bin.charAt(bin.length() - 1 - i) - '0';
            result = result + (conv * Math.pow(2, i));
        }
        System.out.println("Desimaali on " + result);
        scanner.close();
    }
}
