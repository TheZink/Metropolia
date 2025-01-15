public class Task2 {
    public static void main(String[] args) {

        // Määritetään puun korkeus sekä merkkijonon aloitusmäärä
        int height = 4;
        int star = 1;

        for (int i = 1; i <= height; i++) {

            // Lisätään välilyönnit riville
            for (int k = 1; k <= height - i; k++) {
                System.out.print(" ");
            }
            // Lisätään merkkijono(t) riville
            for (int j = 1; j <= star; j++) {
                System.out.print("*");

            }
            // Tehdään rivinvaihto sekä lisätään merkkijonon määrä
            star = star + 2;
            System.out.println();
        }
    }
}
