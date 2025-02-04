package system;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.LibraryMember;

public class Library {
    List<Book> books = new ArrayList<>();
    List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kirja " + book.getTitle() + " lisätty järjestelmään");
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Käyttäjä "+ member.getName() + " lisätty järjestelmään");
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (!book.getReserved()) {
            member.borrowBook(book);
            System.out.println("Kirja " + book.getTitle() + " lainattu onnistuneesti käyttäjälle " + member.getName());
        } else {
            System.out.println("Kirja " + book.getTitle() + " lainaus epäonnistui käyttäjälle " + member.getName());
        }       
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.returnBook(book)) {
            System.out.println("Kirja " + book.getTitle() + " palautettu onnistuneesti käyttäjältä " + member.getName());
        } else {
            System.out.println("Kirja " + book.getTitle() + " palautus epäonnistui käyttäjälle " + member.getName());
        }
    }

    public void reserveBook(Book book) {
        if (!book.getReserved()){
        book.setReserved(true);
        System.out.println(book.getTitle() + " kirjan tila on nyt: " + book.getReserved());
        } else {
            System.out.println("Kirjaa " + book.getTitle() + " on varattu");
        }
    }

    public void unreverseBook(Book book) {
        if (book.getReserved()) {
            book.setReserved(false);
            System.out.println(book.getTitle() + " kirjan tila on nyt: " + book.getReserved());
        }
    }

    public void isBookReserved(Book book) {
        if (!book.getReserved()) {
            System.out.println( book.getTitle() + " ei ole varattu");
        } else {
            System.out.println( book.getTitle() + " on varattu / lainassa");
        }
    }

    public void checkBorrowedBooks() {}
}
