public class Book {
    
    private int bookNumber;
    private String title;
    private String author;
    private double price;

    public Book(int bookNumber, String title, String author, double price) {
        this.bookNumber = bookNumber;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Book myBook = new Book(1, "The Notebook", "Nicholas Spark", 1999.99);

        System.out.println("Book Number: " + myBook.getBookNumber());
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: PHP" + myBook.getPrice());

        myBook.setPrice(1599.99);
        System.out.println("Updated Price: PHP" + myBook.getPrice());
    }
}
