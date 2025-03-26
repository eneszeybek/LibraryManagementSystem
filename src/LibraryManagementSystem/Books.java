package LibraryManagementSystem;

public class Books {

    private String title;
    private String author;
    private String isbn;
    private boolean status;

    public Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

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

    @Override
    public String toString() {
        return "LibraryManagementSystem.Books{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN=" + isbn +
                ", Status=" + status +
                '}';
    }
}
