import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        do {
            for (int i = 0; i <= 10; i++) {

                // Arvotaan luvut 1-10 väliltä. Muutetaan samalla luvut int-muotoon, koska luokka tuottaa liukuluvut
                int a = (int) (Math.random() * 10) + 1;
                int b = (int) (Math.random() * 10) + 1; 

                System.out.println("Mikä on " + a + " kertaa " + b +"?");
                int number = Integer.parseInt(scanner.nextLine());

                // Tarkastetaan käyttäjän syöttämä vastaus. Jos tosi, niin ohjelma rekisteröi pisteen ja tulostaa viestin.
                if (number == (a * b)) {
                    score++;
                    System.out.println( "Hyvää työtä, laskit oikein! Sait tästä tehtävästä yhden pisteen. Sinulla on nyt "+ score);
                    
                    // Tarkastetaan, onko käyttäjä saanut täydet pisteet. Jos tosi, niin lopetetaan ohjelma
                    if (score == 10) {
                        System.out.println("Onneksi olkoon! Suoritit matematiikan kertolaskun kokeen!");
                        break;
                    }

                } else {
                    System.out.println("Vastasit väärit. " + a + " kertaa " + b + " on: " + (a*b));
                }
            }
        } while (score != 10);
        scanner.close();
    }
}
