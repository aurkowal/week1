package pl.coderslab.asserts;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByTitle(String title) {
        return books.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).toList();
    }


    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    return true;
                } else {
                    return false; // już wypożyczona
                }
            }
        }
        return false; // książka nie istnieje
    }



    public boolean returnBook(Book bookToReturn) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookToReturn.getTitle()) && !book.isAvailable()) {
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }

}
