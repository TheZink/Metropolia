public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book;
        User user;

        book = new Book("Java","Ilkka", 2025, 1, "Kirja1");
        library.addBook(book);

        book = new Book("SQL","Robert",2023, 2, "kirja2.");
        library.addBook(book);

        book = new Book("Python","Ilkka",2020,5,"kirja3");
        library.addBook(book);

        // Koodin testausta

        library.findBooksByAuthor("Ilkka");
        library.findBooksByAuthor("Robert");

        System.out.println("Tulostetaan kirjaston sisältö:");
        library.displayBooks();


        user = new User("Jukka", 30);
        library.borrowBook("Python", user.getName());

        
        System.out.println("Kirja Python tila on: " + library.isBookAvailable("Python"));


        System.out.println("Tulostetaan kirjaston keskiarvo:");
        System.out.printf("Kirjojen keskiarvo on: %.2f\n",library.getAverageBookRating());

        library.getMostReviewedBook();

        user = new User("Toni", 30);
        library.borrowBook("Java", user.getName());

        library.userBorrow();

        user = new User("Jukka", 30);
        library.returnBook("Python", user.getName());

        System.out.println("Kirja Python tila on: " + library.isBookAvailable("Python"));

        library.userBorrow();










    }

}
