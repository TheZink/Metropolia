import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Luodaan kirjat
        Book book1 = new Book("Python", "Pekka Pythonen", "14FD");
        Book book2 = new Book("Java", "Jussi Javaaja", "551");
        Book book3 = new Book("SQL", "Sakari Sekoittaja", "3414g");
        Book book4 = new Book("C++", "Matti Meikäläinen", "414ff");
    
        // Luodaan käyttäjät
        LibraryMember user1 = new LibraryMember("Kalle Koodaaja");
        LibraryMember user2 = new LibraryMember("Daniel Debuggaaja");
        LibraryMember user3 = new LibraryMember("Atte Auditoija");
        LibraryMember user4 = new LibraryMember("Toni Testaaja");

        // Lisätään kirjat järjestelmään
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        System.out.println();

        // Lisätään käyttäjät järjestelmään
        library.addMember(user1);
        library.addMember(user2);
        library.addMember(user3);
        library.addMember(user4);
        System.out.println();

        // Testataan kirjojen lainausta
        library.borrowBook(user1, book1);
        library.borrowBook(user1, book2);
        library.borrowBook(user2, book3);
        library.borrowBook(user3, book1);
        System.out.println();

        user1.printBorrowedBooks();
        user2.printBorrowedBooks();
        System.out.println();


        // Testataan, onko kirjat varattu
        library.isBookReserved(book1);
        library.isBookReserved(book2);
        library.isBookReserved(book3);
        System.out.println();

        // Testataan kirjojen palautusta
        library.returnBook(user1, book1);
        library.returnBook(user1, book2);
        System.out.println();

        user1.printBorrowedBooks();
        System.out.println();
        
        library.isBookReserved(book1);
        library.isBookReserved(book2);
        library.isBookReserved(book3);

        library.borrowBook(user3, book1);
        System.out.println();


        // Testataan kirjan varausta
        library.reserveBook(book4);
        library.isBookReserved(book4);
        System.out.println();

        library.unreverseBook(book4);
        library.isBookReserved(book4);
        System.out.println();






    }
}