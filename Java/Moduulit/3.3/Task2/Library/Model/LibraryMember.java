package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;                                                              
    private List<Book> borrowedBooks = new ArrayList<>();    // Instanssikohtainen lista
    private static int instanceCounter = 1;                  // Instanssin luontikerta

    public LibraryMember(String name) {
        this.name = name;
        this.memberId = instanceCounter++;                   // Luodaan käyttäjälle uniikki id
    }

    public void setName(String name) { 
        this.name = name;
    }

    public String getName(){ 
        return name; 
    }

    public int getMemberId(){ 
        return memberId; 
    }

    public List<Book> getList(){
        return borrowedBooks;
    }

    public boolean borrowBook(Book book) { 
        if (!borrowedBooks.contains(book)){               
            borrowedBooks.add(book);
            book.setReserved(true);    // Muutetaan kirjan boolean arvo                                            
            return true;                        // Palautetaan true, kun kirja on lainattu käyttäjälle
        }
        return false;                           // Palautetaan false, mikäli kirja on jo lainattu käyttäjälle
    }

    public boolean returnBook(Book book) {        
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);         
            book.setReserved(false);   // Muutetaan kirjan boolean arvo                                          
            return true;                        // Palautetaan true, jos poisto onnistui
        }
        return false;                           // Palautetaan false, jos kirjaa ei ole lainattu
    }

    // Lainauslistan testausta
    public void printBorrowedBooks(){
        System.out.println(name + " lainausdata:");
        if (!borrowedBooks.isEmpty()) {
            for (Book item: borrowedBooks) {
                System.out.println(item.getTitle());
            }
        } else {
            System.out.println("Ei ole kirjoja lainassa");
        }
    }
}


