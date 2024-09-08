import java.util.Date;

public class Transaction {
    private String transactionId;
    private Date date;
    private double amount;
    private String type;
    private Account sourceAccount;
    private Account destinationAccount;

    public Transaction(String transactionId, Date date, double amount, String type, Account sourceAccount, Account destinationAccount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public void executeTransaction() {
        if (type.equals("Transfer")) {
            sourceAccount.transfer(destinationAccount, amount);
        } else if (type.equals("Debit")) {
            sourceAccount.withdraw(amount);
        } else if (type.equals("Credit")) {
            destinationAccount.deposit(amount);
        }
        System.out.println("Transaction completed successfully.");
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Date: " + date);
        System.out.println("Amount: " + amount);
        System.out.println("Type: " + type);
    }
}
