
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nCopyright Date: " + copyrightDate;
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);
        Book book3 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);

        book1.setTitle("The Catcher in the Rye");
        book2.setPublisher("Harper & Brothers");
        book3.setAuthor("Eric Arthur Blair");

        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println();

        System.out.println("Book 2:");
        System.out.println(book2);
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3);
    }
}
