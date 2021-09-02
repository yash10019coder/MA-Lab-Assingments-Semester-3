package Assingment4.Q6.Bank;

public class BankAccount implements Balance {
    private float amount;
    private String accNo;

    public BankAccount() {
        amount = 1000;
        accNo = "XXXX XXXX";
    }

    public BankAccount(float amt, String acc) {
        amount = amt;
        accNo = acc;
    }

    public void addBalance(float b) {
        amount = amount + b;
    }

    public void showBalance() {
        System.out.println("Account No : " + accNo + "\nCurrent Balance : " + amount);
    }
}
