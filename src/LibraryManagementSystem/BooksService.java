package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BooksService {

    private final BooksRegistry booksRegistry = new BooksRegistry();

    public List<Books> searchByTitle(String titleToSearch) {
        List<Books> foundBooks = new ArrayList<>();
        List<Books> allBooks = booksRegistry.findAll();
        for(Books book : allBooks){
            if(book.getTitle().contains(titleToSearch)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Books> getAll() {
        return booksRegistry.findAll();
    }

    public void returnBook(String bookIsbn) {
        boolean isReturned = booksRegistry.isCheckedOut(bookIsbn);
        if(isReturned){
            Books book = booksRegistry.findByIsbn(bookIsbn);
            book.setStatus(true);
        }
    }

    public void addBook(String title, String author, String isbn) {
        Books book = new Books(title, author, isbn);
        book.setStatus(false);
        booksRegistry.register(book);
    }

    public void checkOut(String isbnToCheckOut) {
        boolean isCheckedOut = booksRegistry.isCheckedOut(isbnToCheckOut);
        if(isCheckedOut){
            Books book = booksRegistry.findByIsbn(isbnToCheckOut);
            book.setStatus(true);
        }
    }
}
