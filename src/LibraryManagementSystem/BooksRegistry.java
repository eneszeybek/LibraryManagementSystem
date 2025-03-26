package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BooksRegistry {

    private List<Books> books = new ArrayList<>();

    public List<Books> findAll() {
        return books;
    }

    public boolean isCheckedOut(String bookIsbn) {
        for(Books book : books){
            if(book.getIsbn().equals(bookIsbn)){
                return true;
            }
        }
        return false;
    }

    public Books findByIsbn(String bookIsbn) {

        for(Books book : books){
            if(book.getIsbn().equals(bookIsbn)){
                return book;
            }
        }
        return null;
    }

    public void register(Books book) {
        books.add(book);
    }
}
