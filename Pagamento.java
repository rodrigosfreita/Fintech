import java.util.Date;

public class Payment {
    private String paymentId;
    private double amount;
    private Date paymentDate;
    private Account account;
    private String description;

    public Payment(String paymentId, double amount, Date paymentDate, Account account, String description) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.account = account;
        this.description = description;
    }

   
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void makePayment() {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Payment of " + amount + " completed successfully.");
        } else {
            System.out.println("Insufficient balance to complete the payment.");
        }
    }

    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Date: " + paymentDate);
        System.out.println("Amount: " + amount);
        System.out.println("Description: " + description);
    }
}
