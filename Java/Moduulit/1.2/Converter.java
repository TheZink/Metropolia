import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä Fahrenheit: ");
        int Fahrenheit = scanner.nextInt();

        double celsius = (Fahrenheit - 32) / 1.8;

        scanner.close();

        System.out.printf("Syötit %d Fahrenheit-astetta. Muutettuna se on %.1f Celsius-astetta", Fahrenheit, celsius);

    }
}
