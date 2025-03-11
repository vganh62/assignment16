package Assignment16;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    ReferenceBook() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status: ");
        tax = scanner.nextDouble();
    }

    @Override
    public void updateBook(String id) {
        super.updateBook(id);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tax: ");
        tax = scanner.nextDouble();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.print("tax: " + tax);
    }
}
