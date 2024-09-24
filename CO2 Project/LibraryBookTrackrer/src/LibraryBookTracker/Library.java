package LibraryBookTracker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Set<Book> availableBooks = new HashSet<>();
    private Map<Borrower, Set<Book>> borrowedBooks = new HashMap<>();

    // Add a new book to the library
    public void addBook(Book book)

    