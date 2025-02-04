package Model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void setName(String name) { 
        this.name = name; 
    }
    public void setMemberId(int memberId){ 
        this.memberId = memberId; 
    }

    public String getName(){ 
        return name; 
    }

    public int getMemberId(){ 
        return memberId; 
    }

    // Tarkastetaan käyttäjän lainauslistaa. 
    public void borrowBook(int memberId, Book book) { 
        if (!borrowedBooks.contains(book)){ 
            borrowedBooks.add(book);                                            
            System.out.println(name + " lainasi kirjan " + book.getTitle());
            return;
        } else {
            System.out.println(name + " on jo lainannut kirjan " + book.getTitle());
        }
    }

    public void returnBook(int memberId, Book book) {        
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            System.out.println(name + " palautti kirjan " + book.getTitle());
            return;
        } else {
            System.out.println("Palautettavaa " + book.getTitle() + " kirjaa ei löytynyt lainausjärjestelmästä");
        }
    }
}


