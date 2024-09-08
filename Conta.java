import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;
    private String accountType;
    private String ownerName;

    public Account(String accountNumber, double balance, String accountType, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.ownerName = ownerName;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Operation Methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void transfer(Account destination, double amount) {
        if (balance >= amount) {
            this.withdraw(amount);
            destination.deposit(amount);
        } else {
            System.out.println("Insufficient funds for transfer");
        }
    }

    public void displayBalance() {
        System.out.println("Account balance " + accountNumber + ": " + balance);
    }
}

