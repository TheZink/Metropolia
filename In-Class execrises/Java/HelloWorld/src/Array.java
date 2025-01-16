import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers1 = new int[1000];

        // Taulukon alkiot alkavat 0:sta
        // Luku 'int[size]' kertoo, minkä kokoinen taulukko on. Taulukkoa ei voi
        // kasvattaa jälkikäteen.

        for (int k = 0; k < numbers1.length; k++) {
            numbers1[k] = k * 10;
        }

        // Kysytään käyttäjältä alkion kokoa
        System.out.println("Montako alkiota haluat?");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Luodaan listaan numeroita
        for (int i = 0; i < size; i++) {
            numbers[i] = i * 2;
        }
        scanner.close();

        System.out.println("Viimeinen numero on: " + numbers1[numbers1.length - 1]);

        // Listan iterointi for-loopilla
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Jos haluamme luoda listan, joka sisältää esimerkiksi nimiä
        String[] name_array = { "Ilkka", "Jukka", "Pekka" };

        for (String name : name_array) {
            System.out.print(name + " ");
        }

    }
}
