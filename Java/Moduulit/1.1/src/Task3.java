import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is: " + (first + second + third)); // Lasketaan lukujen summa
        System.out.println("Product is: " + (first * second * third)); // Lasketaan lukujen tulo
        System.out.println("And average is: " + ((first + second + third) / 3.0)); // Lasketaan lukujen keskiarvo
    }
}