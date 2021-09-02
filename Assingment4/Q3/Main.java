package Assingment4.Q3;

import Assingment4.Q3.Package.*;

public class Main {
    public static void main(String[] args) {
        // Kitchen class ->
        Kitchen k = new Kitchen();
        k.prepareFood("Pasta");

        // Book class
        Book bk = new Book("Gone Girl", "Gillian Flynn", 284.00f);
        bk.displayDetails();
        bk.purchase(1);

        // Car class
        Car c = new Car();
        c.drive();
        c.park();

    }
}
