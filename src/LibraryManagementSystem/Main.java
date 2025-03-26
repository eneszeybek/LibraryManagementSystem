package LibraryManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BooksService booksService = new BooksService();

    public static void main(String[] args) {

        boolean running = true;
        int selection;

        while (running){

            printMenu();

            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection){
                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchByTitle();
                    break;

                case 4:
                    checkOut();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid selection");
            }
        }
    }

    private static void checkOut() {
        System.out.print("Enter the ISBN of the book you want to check out: ");
        String isbnToCheckOut = scanner.nextLine();
        booksService.checkOut(isbnToCheckOut);
    }

    private static void searchByTitle() {
        System.out.print("Enter book title to search: ");
        String titleToSearch = scanner.nextLine();
        List<Books> foundBooks = booksService.searchByTitle(titleToSearch);
        for(Books book : foundBooks){
            System.out.println(book);
        }
    }

    private static void displayBooks() {
        List<Books> allBooks = booksService.getAll();
        for(Books book : allBooks){
            System.out.println(book);
        }
    }

    private static void returnBook() {
        System.out.print("Enter the ISBN of the book you want to return: ");
        String bookIsbn = scanner.nextLine();
        booksService.returnBook(bookIsbn);
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        booksService.addBook(title, author, isbn);
    }

    private static void printMenu() {
        System.out.println("Please select an option");
        System.out.println("1. Add a new book");
        System.out.println("2. Display all books");
        System.out.println("3. Search for a book by title");
        System.out.println("4. Check out a book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
    }
}