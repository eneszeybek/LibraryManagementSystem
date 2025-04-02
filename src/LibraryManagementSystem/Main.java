package LibraryManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BooksService booksService = new BooksService();

    public static void main(String[] args) {

        //Parameters for running the main while loop and getting user selection
        boolean running = true;
        int selection;

        System.out.println("Welcome to the library Management System!");


        //User interaction loop
        while (running){

            //Showing the menu
            printMenu();

            //Getting user selection
            selection = scanner.nextInt();
            scanner.nextLine();

            //Switch-case loop for managing user selections
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

    //Method for checking out a book
    private static void checkOut() {
        System.out.print("Enter the ISBN of the book you want to check out: ");
        String isbnToCheckOut = scanner.nextLine();
        booksService.checkOutBook(isbnToCheckOut);
    }

    //Method for searching a key word in the book titles
    private static void searchByTitle() {
        System.out.print("Enter book title to search: ");
        String titleToSearch = scanner.nextLine();
        List<Books> foundBooks = booksService.searchByTitle(titleToSearch);
        System.out.println("\nFound books:\n----------------");
        foundBooks.forEach(System.out::println);
    }

    //Method for listing entire inventory of books
    private static void displayBooks() {
        List<Books> allBooks = booksService.getAll();
        System.out.println("All books:\n----------------");
        allBooks.forEach(System.out::println);
    }

    //Method for returning checked out books
    private static void returnBook() {
        System.out.print("Enter the ISBN of the book you want to return: ");
        String isbnToReturn = scanner.nextLine();
        booksService.returnBook(isbnToReturn);
    }

    //Method for adding new books to the system
    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        booksService.addBook(title, author, isbn);
        System.out.println("Book added successfully!");
    }

    //Main method for user interactions
    private static void printMenu() {
        System.out.println("\nPlease select an option:");
        System.out.println("1. Add a new book");
        System.out.println("2. Display all books");
        System.out.println("3. Search for a book by title");
        System.out.println("4. Check out a book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
}