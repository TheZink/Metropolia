import java.util.Scanner;

public class Measures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Määritetään esineille painot grammoina
        double bullet = 13.28;
        double nail = bullet * 32;
        double bread = nail * 20;

        // Kysytään käyttäjältä syötettä
        System.out.println("Syötä grammat: ");
        double gramm = scanner.nextDouble();

        // Lasketaan, montako esinettä saadaan laskettua
        double bread_amount = gramm / bread;
        double nail_amount = (gramm - bread_amount) / nail;
        double bullet_amount = (gramm - bread_amount - nail_amount) / bullet;

        System.out.printf("%d grammaa on %d leiviskää, %d naulaa ja %2f luotia", bread_amount, nail_amount,
                bullet_amount);

    }

}
