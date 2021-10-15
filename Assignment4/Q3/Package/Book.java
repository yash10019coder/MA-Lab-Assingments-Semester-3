package Assingment4.Q3.Package;

public class Book {
    String title, author;
    float price;

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("\nBook Name : " + title + "\nAuthor : " + author + "\nPrice : " + price + " Rs.\n");
    }

    public void purchase(int qty) {
        System.out.println("\nPurchasing " + qty + " copy(s) of " + title);
        System.out.println("Total Cost : " + (qty * price));
    }
}
