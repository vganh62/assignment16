package Assignment16;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status: ");
        status = scanner.nextLine();
    }

    @Override
    public void updateBook(String id) {
        super.updateBook(id);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status: ");
        status = scanner.nextLine();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.print("status: " + status);
    }
}
