import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kysytään käyttäjältä listan pituus
        System.out.print("Listan pituus: ");
        int size = scanner.nextInt();

        // Luodaan listaa
        int[] numbers = new int[size];

        // Pyydetään käyttäjää syöttämään arvot
        for (int i = 0; i < size; i++) {
            System.out.print("Syötä numero " + (i+1) + " :");
            int number = scanner.nextInt();

            boolean inList = false; // Kaksoiskappaleen tarkastus

            // Tarkastetaan, onko numero listassa
            for (int k = 0; k < numbers.length; k++) {
                if (number == numbers[k]) {
                    inList = true;
                    break;
                }
            }
            // Numero lisätään listaan, jos sitä ei ole
            if (!inList) {
                numbers[i] = number;
            }
        }
        
        // Tulostetaan käyttäjälle tiedot
        System.out.println("Lista ilman kaksoiskappaletta");
        for (int num: numbers) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
