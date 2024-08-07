

public class Book {
    // Attributes (State)
    private String title;
    private String author;
    private int pages;
    private boolean isOpen;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isOpen = false; // Initial state: the book is closed
    }

    // Methods (Behaviors)

    // Open the book
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("The book '" + title + "' is now open.");
        } else {
            System.out.println("The book is already open.");
        }
    }

    // Close the book
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("The book '" + title + "' is now closed.");
        } else {
            System.out.println("The book is already closed.");
        }
    }

    // Get book details
    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Is Open: " + isOpen);
    }

    // Read the book (simulate reading some pages)
    public void read(int pagesRead) {
        if (isOpen) {
            System.out.println("You read " + pagesRead + " pages of '" + title + "'.");
        } else {
            System.out.println("You need to open the book first.");
        }
    }
}
