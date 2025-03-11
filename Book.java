package Assignment16;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public abstract class Book implements IBook {

    String bookId;
    String publisher;
    Date entryDate;
    double unitPrice;
    double quantity;

    public Book() {
    }

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.quantity = quantity;
    }

    public void addBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter bookId: ");
            bookId = scanner.nextLine();
            System.out.print("Enter publisher: ");
            publisher = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.print("Enter entryDate (dd/MM/YYYY):");
            String entryDateString = scanner.nextLine();
            entryDate = sdf.parse(entryDateString);
            System.out.print("Enter unitPrice: ");
            unitPrice = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            quantity = scanner.nextDouble();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateBook(String id) {
        addBook();
    }

    @Override
    public void displayBook() {
        System.out.println("ID book: " + bookId);
        System.out.println("Publisher: " + publisher);
        System.out.println("Entry date: " + entryDate);
        System.out.println("UnitPrice: " + unitPrice);
        System.out.println("Quantity: " + quantity);
    }
}
