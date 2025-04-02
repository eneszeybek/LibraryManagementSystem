package LibraryManagementSystem;

public class Books {

    //Introducing constructor method parameters and status parameter
    private String title;
    private String author;
    private String isbn;
    private boolean status;

    //Defining object by its parameters
    public Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //Below are getter and setter methods

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //toString method for object outputs

    @Override
    public String toString() {
        String isAvailable;
        if(getStatus()){
            isAvailable = "Available";
        }
        else isAvailable = "Not available";

        return  "Title\t: " + title +
                "\nAuthor\t: " + author +
                "\nISBN\t: " + isbn +
                "\nStatus\t: " + isAvailable +
                "\n---------------";
    }
}
