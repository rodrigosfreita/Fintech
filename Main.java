import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the client's name: ");
        String clientName = scanner.nextLine();

        System.out.print("Enter the client's CPF: ");
        String clientCpf = scanner.nextLine();

        Client client = new Client(clientName, clientCpf);

      
        while (true) {
            System.out.print("\nEnter the account number (or type 'exit' to finish): ");
            String accountNumber = scanner.nextLine();
            if (accountNumber.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the initial balance of the account: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Enter the type of account (Current/Savings): ");
            String accountType = scanner.nextLine();

            Account account = new Account(accountNumber, initialBalance, accountType, clientName);
            client.addAccount(account);
        }

        
        while (true) {
            System.out.println("\nOperations Menu:");
            System.out.println("1. Display client information and account balances");
            System.out.println("2. Make a transfer between accounts");
            System.out.println("3. Make a payment");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            if (option == 1) {
                client.displayClientInfo();
            } else if (option == 2) {
                System.out.print("\nEnter the source account number: ");
                String sourceAccountNumber = scanner.nextLine();
                Account sourceAccount = client.findAccountByNumber(sourceAccountNumber);

                System.out.print("Enter the destination account number: ");
                String destinationAccountNumber = scanner.nextLine();
                Account destinationAccount = client.findAccountByNumber(destinationAccountNumber);

                if (sourceAccount != null && destinationAccount != null) {
                    System.out.print("Enter the amount to be transferred: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();

                    Transaction transferTransaction = new Transaction("TX" + System.currentTimeMillis(), new Date(), transferAmount, "Transfer", sourceAccount, destinationAccount);
                    transferTransaction.executeTransaction();
                    System.out.println("Transfer successfully completed.");
                } else {
                    System.out.println("Source or destination account not found.");
                }

            } else if (option == 3) {
                System.out.print("\nEnter the account number to make the payment: ");
                String accountNumber = scanner.nextLine();
                Account account = client.findAccountByNumber(accountNumber);

                if (account != null) {
                    System.out.print("Enter the payment amount: ");
                    double paymentAmount = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Enter the payment description: ");
                    String paymentDescription = scanner.nextLine();

                    Payment payment = new Payment("PG" + System.currentTimeMillis(), paymentAmount, new Date(), account, paymentDescription);
                    payment.makePayment();
                    System.out.println("Payment successfully completed.");
                } else {
                    System.out.println("Account not found.");
                }

            } else if (option == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

        // Fechando o scanner
        scanner.close();
    }
}
