public class Book15 {
    public String isbn;
    public String title;

    public Book15() {
    }

    public Book15(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    
    public String toString() {
        return " ISBN: " + this.isbn + " Title: " + this.title;
    }
}
