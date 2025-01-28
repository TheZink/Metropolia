public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private String review;

    public Book(String title, String author, int year, double rating, String review) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = rating;
        this.review = review;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    int getYear(){
        return year;
    }
    
    String getReview(){
        return review;
    }

    Double getRating(){
        return rating;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setYear(int year){
        this.year = year;
    }

    void setReview(String review){
        this.review = review;
    }

    void setRating(double rating){
        this.rating = rating;
    }

}
