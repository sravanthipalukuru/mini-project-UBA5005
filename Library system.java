class LibraryBook {
    int bookId;
    String bookName;
    String author;
    boolean isIssued = false;

    void issueBook() {
        if(isIssued == false){
            isIssued = true;
            System.out.println("book issued successfully");
        } else {
            System.out.println("book already issued");
        }
    }

    void returnBook() {
        if(isIssued == true){
            isIssued = false;
            System.out.println("book returned successfully");
        } else {
            System.out.println("book was not issued");
        }
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
    }
}

public class Main {
    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook();

        book1.bookId = 102;
        book1.bookName = "Java Programming";
        book1.author = "James Gosling";

        book1.displayBook();
        book1.issueBook();
    }
}