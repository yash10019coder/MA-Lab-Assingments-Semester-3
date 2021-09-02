package Assingment4.Q6;

import Assingment4.Q6.Bank.BankAccount;

public class Employee {
    private BankAccount bAcc;
    private String name;

    Employee(String name, float amt, String acc) {
        this.name = name;
        bAcc = new BankAccount(amt, acc);
    }

    Employee(String name) {
        this.name = name;
        bAcc = new BankAccount(1500f, "1234 5678");
    }

    void addSalary(float salary) {
        bAcc.addBalance(salary);
    }

    void showEmployeeDetails() {
        System.out.println("Name : " + name);
        System.out.println("Bank Account Details -> ");
        bAcc.showBalance();
    }

}
