import java.util.*;

class Book implements BookOperations {
    private static int bookCount = 0;

    public static int getBookCount() {
        return bookCount;
    }

    protected String title;
    protected double price;
    protected int bookId;
    protected Date addedDate;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        this.bookId = new Random().nextInt(1000);
        this.addedDate = new Date();
        bookCount++;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Title: %s, Price: %.2f, Book ID: %d, Added Date: %s\n", title, price, bookId, addedDate.toString());
    }

    public boolean search(String query) {
        return title.contains(query);
    }

    public boolean search(Double price) {
        return this.price == price;
    }
}
