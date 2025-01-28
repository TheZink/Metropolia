import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<String, Book> borrowed = new HashMap<>();

    public Library() {}

    // Lisätään tuote kirjastoon, jos se ei ole vielä olemassa.
    void addBook(Book book) {
        for (Book item: books) {
            if (item.getTitle().equals(book.getTitle())) {
                System.out.printf("%s kirja on jo olemassa\n", item.getTitle());
                return;
            }
        }
        books.add(book);
        System.out.printf("Lisätty %s kirjastoon.\n", book.getTitle());
    }

    // Tulostetaan kirjojen tiedot
    void displayBooks(){
        for (Book item: books) {
            System.out.printf("Nimi: %s, kirjailija: %s, julkaisuvuosi: %d\n", item.getTitle(), item.getAuthor(),item.getYear());
        }
    }

    // Palautetaan kirjat kirjailijan nimen perusteella
    void findBooksByAuthor(String author) {
        for (Book item: books) {
            if (item.getAuthor().equals(author)) {
                System.out.printf("%s, julkaisuvuosi: %d\n", item.getTitle(), item.getYear());
            }
        }
    }

    // Metodi tarkastaa, onko kirja saatavilla ja on vapaana
    boolean isBookAvailable(String title) {
        
        for (Book item: books) {
            for (String user: borrowed.keySet()){
                // Jos kirja on lainassa, palautetaan false
                if (item.getTitle().equals(title) && borrowed.get(user).getTitle().equals(title)){
                    return false;
            }
            }
        }
        return true;
    }

    // Simuloidaan tuotteen lainausta kirjan nimen perusteella, jos se on saatavilla
    // Lainausta seurataan borrowed listassa. <nimi>: <kirja>
    void borrowBook(String title, String userName){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                System.out.printf("%s lainasi kirjan: '%s', %d\n", userName, books.get(i).getTitle(), books.get(i).getYear());
                borrowed.put(userName, books.get(i));
                return;
            }
        }
        System.out.printf("%s ei ole saatavilla", title);
    }

    // Simuloidaan tuotteen palautusta kirastoon käyttäjän ja kirjan nimen perusteella
    void returnBook(String title, String userName) {
        for (String user: borrowed.keySet()) {
            if (user.equals(userName) && borrowed.get(user).getTitle().equals(title)){
                System.out.printf("%s palautti kirjan: '%s'\n", userName,borrowed.get(user).getTitle());
                borrowed.remove(userName);
                return;
            }
        }
        System.out.printf("Joko %s on jo listalla tai sitten syötit väärät tiedot.\n", title);
    }

    // Metodi palauttaa pisteytyksen keskiarvon
    double getAverageBookRating(){
        double average_rating = 0;
        for (Book item: books) {
            if (!books.isEmpty()) {
                average_rating = average_rating + item.getRating();
            }
        }
        return (average_rating/books.size());
    }

    // Metodi palauttaa kirjan, jossa on korkein pisteytys
    void getMostReviewedBook() {
        double rating = 0;
        int location = 0;

        for (int k = 0; k < books.size(); k++) {
            if (books.get(k).getRating() > rating) {
                rating = books.get(k).getRating();
                location = k;
            }
        }
        System.out.printf("Arvosteluin kirja on: %s. Kirjan pisteytys on: %.2f.\n",books.get(location).getTitle(), rating);
    }

    void userBorrow(){
        for (String user: borrowed.keySet()){
            System.out.printf("Kirja %s on lainassa käyttäjällä: %s\n",borrowed.get(user).getTitle(),user);
        }
    }
}
