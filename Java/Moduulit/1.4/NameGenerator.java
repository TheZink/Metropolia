import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        String[] firstname_array = {"Tero","Pekka","Jukka","Olavi","Harri"};
        String[] lastname_array = {"Salonen","Virta","Virtanen","Korhonen", "Mäkinen"};
        Scanner scanner = new Scanner(System.in);
        
        // Kysytään käyttäjältä, montako nimeä tulostetaan
        System.out.println("Montako nimeä haluat tulostaa?");
        int times = scanner.nextInt();

        
        for (int i = 0; i <= times; i++) {
            
            // Generoidaan satunnaiset luvut 0-(listan pituus)
            int randomNum1 = (int) (Math.random() * firstname_array.length - 1);
            int randomNum2 = (int) (Math.random() * lastname_array.length - 1);            
            
            // Tulostetaan nimet
            System.out.println(i + ". " + firstname_array[randomNum1] + " " + lastname_array[randomNum2]);
        }
        scanner.close();
    }


}
