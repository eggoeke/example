
public class App {
    public static void main(String[] args) throws Exception {
        Book myBook = new Book("1984", "George Orwell", 328);

        // Accessing the object's methods
        myBook.getDetails(); // Display book details
        myBook.open();       // Open the book
        myBook.read(30);     // Read 30 pages
        myBook.close();      // Close the book
        myBook.read(10);     // Try to read while the book is closed
    }
}
