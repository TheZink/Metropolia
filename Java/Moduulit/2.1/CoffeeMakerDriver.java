import java.util.Scanner;

public class CoffeeMakerDriver {
    public static void main(String[] args) {

        CoffeeMaker coffeemaker = new CoffeeMaker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Mitä haluat tehdä?");
            System.out.println("1) Paina virtanäppäintä.");
            System.out.println("2) Valitse kahvi (Normal/Espresso)");
            System.out.println("3) Valitse määrä");
            System.out.println("4) Lopeta ohjelma");

            int input = scanner.nextInt();

            switch (input) {
                // Käyttäjä voi vaihtaa kahvinkeittimen tilan
                case 1:
                    if (coffeemaker.coffeeMakerOnOf()) {
                        System.out.println("Kahvinkeitin on nyt päällä");
                        System.out.println("Kahvinkeittimessä oli valittuna: " + coffeemaker.getCoffee());
                        System.out.println("Määrä oli valittuna: " + coffeemaker.getAmmount() + "ml.");
                    } else {
                        System.out.println("Kahvinkeitin on pois päältä");
                    }
                    break;

                // Käyttäjää valitsee kahvin
                case 2:
                    System.out.println("Valitse kahvi: 1) Normal 2) Espresso");
                    Integer choise = scanner.nextInt();
                    if (choise == 1) {
                        coffeemaker.selectCoffee("Normal");
                    } else {
                        coffeemaker.selectCoffee("Espresso");
                    }
                    break;

                // Käyttäjä valitsee määrän
                case 3:
                    System.out.println("valitse määrä millilitroina: ");
                    coffeemaker.selectAmount(scanner.nextDouble());
                    break;
            }

            // Tämä lopettaa ohjelman
            if (input == 4) {
                System.out.println("Näkemiin!");
                break;
            }
        }
        scanner.close();
    }

}
