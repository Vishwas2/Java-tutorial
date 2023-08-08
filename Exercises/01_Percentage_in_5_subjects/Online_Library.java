// You have to implement a library class using Java class library
// Methods : addBook,issueBook, returnBook, showAvailableBooks
// Properties : Array to store the available books, array to store the issued books
package Exercises;

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added !");
    }

    void showAvailableBooks() {
        System.out.println("Available books are : ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued !");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exist.");
    }

    void returnBook(String book) {
        this.books[no_of_books] = book;
        // addBook(book); -> this will also work fine as this program isn't that complex
    }
}

public class Online_Library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich.");
        centralLibrary.addBook("App Development.");
        centralLibrary.addBook("Machine Learning.");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("App Development.");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("App Development.");
        centralLibrary.showAvailableBooks();
    }
}
