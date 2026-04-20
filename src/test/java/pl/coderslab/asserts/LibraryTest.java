package pl.coderslab.asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {


    @Test
    void givenGoodTitle_whenSearchByTitle_thenReturnedBooleanIfExists() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();
        library.addBook(book);

        assertTrue(library.searchByTitle("harry potter").contains(book));
    }

    @Test
    void givenWrongTitle_whenSearchByTitle_thenReturnedBooleanIfDoNotExists() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();
        library.addBook(book);

        assertTrue(!library.searchByTitle("hobbit").contains(book));
    }

    @Test
    void givenEmptyTitle_whenSearchByTitle_thenReturnedBoolean() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();
        library.addBook(book);

        assertTrue(!library.searchByTitle("").contains(book));
    }

    @Test
    void givenTitle_whenSearchByTitleInEmptyLibrary_thenReturnedBoolean() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();

        assertTrue(!library.searchByTitle("harry potter").contains(book));
    }

    @Test
    void givenExistedTitle_whenBorrowBook_thenReturnedBooleanifPositive() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();
        library.addBook(book);

        assertTrue(library.borrowBook("Harry Potter"));
    }

    @Test
    void givenTitleIsBorrowed_whenBorrowBook_thenReturnedBoolean() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();
        library.addBook(book);
        library.borrowBook("Harry Potter");
        assertTrue(library.borrowBook("Harry Potter"));
    }

    @Test
    void givenBookToReturn_whenReturnBook_thenReturnedBooleanifPositive() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();
        library.addBook(book);
        library.borrowBook("Harry Potter");
        assertTrue(library.returnBook(book));
    }

    @Test
    void givenBookToReturnIfAvailable_whenReturnBook_thenReturnedBoolean() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1990);
        Library library = new Library();
        library.addBook(book);
        library.borrowBook("Harry Potter");
        library.returnBook(book);
        assertTrue(library.returnBook(book));
    }

}