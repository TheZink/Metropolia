package system;

import java.util.List;

import model.Book;
import model.LibraryMember;

public class Library {
    List<Book> books;
    List<LibraryMember> members;

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        
    }

    public void returnBook(LibraryMember member, Book book) {}
}
