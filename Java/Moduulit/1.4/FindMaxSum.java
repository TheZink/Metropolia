import java.util.Scanner;

public class FindMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pyydetään käyttäjältä listan pituus
        System.out.print("Listan pituus: ");
        int size = scanner.nextInt();

        // Luodaan lista
        int[] numbers = new int[size];

        // Pyydetään käyttäjää syöttämään arvot listaan.
        for (int i = 0; i < size; i++) {
            System.out.print("Syötä luku " + (i+1) + " : ");
            int number = scanner.nextInt();
            numbers[i] = number;
        }

        int maxSum = 0, start = 0, end = 0;

        // Käsitellään listaa ja etsitään suurimman summan ja indeksit
        for (int j = 0; j < numbers.length; j++) {

            int currSum = 0;

            // Iteroidaan ajijonot
            for (int k = j; k < numbers.length; k++) {
                currSum += numbers[k];
                
                // Tarkastetaan, onko currSum isompi kuin maxSum
                if (currSum > maxSum) {
                    maxSum = currSum;
                    start = j;
                    end = k;
                }
            }
        }
        scanner.close();

        // Tulostetaan käyttäjälle tiedot
        System.out.println("Suurin summa: " + maxSum);
        System.out.println("Alijonon indeksit: " + (start+1) + "-" + (end+1));

    }
}
