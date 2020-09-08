package Exercise_2;

public class Book {

    private String author;
    private int numberOfPages;

    public Book(String a, int n) {
        author = a;
        numberOfPages = n;
    }

    public Book(String a) {
        author = a;
        numberOfPages = 1;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setNumberOfPages(int n) {
        numberOfPages = n;
    }

    public String getAuthor() {
        return author;
    }

    public double getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return "author = " + this.author + ", numberOfPages = " + this.numberOfPages;
    }


}