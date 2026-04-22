class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    // Constructor
    Library(int books) {
        this.availableBooks = books;
    }

    // Method to issue books
    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class pr22 {
    public static void main(String[] args) {

        Library lib = new Library(3);

        try {
            lib.issueBook(2);

            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
