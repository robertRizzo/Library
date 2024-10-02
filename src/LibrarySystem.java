import java.awt.print.Book;
import java.util.*;

public class LibrarySystem {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public Book findBook(Object searchValue) {
        for (Book currentBook : books) {
            if(searchValue instanceof String && currentBook.search((String) searchValue) {
                    return currentBook;
                }
            } else if (searchValue instanceof Double && currentBook.search(double) searchValue)) {
                return currentBook;
            }
        }
        return null;
    }
    
    public void bubbleSortByPrice() {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books.get(j).price > books.get(j + 1).price) {
                    Collections.swap(books, j, j + 1);
                }
            }
        }
    }

    public void selectionSortByTitle() {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (books.get(j).title.compareTo(books.get(minIndex).title) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(books, i, minIndex);
        }
    }
}
