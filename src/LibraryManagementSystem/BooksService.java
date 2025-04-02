package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BooksService {

    private final BooksRegistry booksRegistry = new BooksRegistry();

    //Searching a key word in the inventory and listing the books with matching names
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

    //Listing entire inventory of books
    public List<Books> getAll() {
        return booksRegistry.findAll();
    }

    //Changing the status of a returned book
    public void returnBook(String isbn) {
        Books book = booksRegistry.findByIsbn(isbn);
        if (book == null || book.getStatus()) {
            System.out.print("\nBook not found or was not checked out.");
        }
        else{
            book.setStatus(true);
            System.out.print("\nBook returned successfully!");
        }
    }

    //Adding new books to library inventory
    public void addBook(String title, String author, String isbn) {
        Books book = new Books(title, author, isbn);
        book.setStatus(true);
        booksRegistry.register(book);
    }

    //Changing the status of a checked out book
    public void checkOutBook(String isbn) {
        Books book = booksRegistry.findByIsbn(isbn);
        if (book == null || !book.getStatus()) {
            System.out.print("\nBook not found or already checked out.");
        }
        else{
            book.setStatus(false);
            System.out.print("\nBook checked out successfully!");
        }
    }
}
