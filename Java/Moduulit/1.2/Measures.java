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
        int gramm = scanner.nextInt();

        // Lasketaan, montako esinettä saadaan laskettua
        int bread_amount = (int) Math.floor(gramm / bread);
        double remaining_bread = gramm % bread;

        int nail_amount = (int) Math.floor(remaining_bread / nail);
        double remaining_nail = remaining_bread % nail;

        double bullet_amount = remaining_nail / bullet;

        System.out.printf("%d grammaa on %d leiviskää, %d naulaa ja %.2f luotia", gramm, bread_amount, nail_amount, bullet_amount);

        scanner.close();

    }

}
