package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BooksRegistry {

    private List<Books> books = new ArrayList<>();

    //Returning entire list of the inventory
    public List<Books> findAll() {
        return books;
    }

    //Searching for an ISBN in the inventory and returning with matching book or null if there isn't a match
    public Books findByIsbn(String bookIsbn) {

        for(Books book : books){
            if(book.getIsbn().equals(bookIsbn)){
                return book;
            }
        }
        return null;
    }

    //Adding an object to the list
    public void register(Books book) {
        books.add(book);
    }
}
