Library Management System
This is a simple Java console application designed to manage a library's book inventory. It allows users to add new books, display all books, search for books by title, check out books, and return books.​

Features
Add a New Book: Input the book's title, author, and ISBN to add it to the library's inventory.​
Display All Books: View a list of all books currently in the library's inventory.​
Search for a Book by Title: Find books which include the input string in their titles.​
Check Out a Book: Mark a book as checked out using its ISBN.​
Return a Book: Mark a previously checked-out book as returned using its ISBN.​

Usage
Upon running the application, you'll be presented with a menu:​

1. Add a new book​
2. Display all books​
3. Search for a book by title​
4. Check out a book​
5. Return a book​
6. Exit​
Enter the number corresponding to your choice and follow the prompts.

Project Structure
The project follows a standard Maven directory structure:

LibraryManagementSystem/
├── src/
│   └── main/
│       └── java/
│           └── LibraryManagementSystem/
│               ├── Main.java
│               ├── Books.java
│               │── BooksService.java
│               └── BooksRegistry.java
├── pom.xml
└── README.md

Main.java: Contains the main method and handles user interaction.​
Books.java: Represents the Books class with constructor, getter and setter methods with attributes of title, author, ISBN and availability.
BooksService.java: Provides methods to operate with user choices, such as adding, listing, searching, checking out, and returning books.​
BooksRegistry.java: Provides methods to BooksService with building up, listing and searching the book inventory.​
pom.xml: Maven configuration file containing project dependencies and build configurations.
