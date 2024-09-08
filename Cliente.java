import java.util.ArrayList;
import java.util.List;

//Rodrigo Santos Freitas Rm557981
//Richard Camargo De Almeida Rm558367

public class Client {
    private String name;
    private String cpf;
    private List<Account> accounts;

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        this.accounts = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void displayClientInfo() {
        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Accounts: ");
        for (Account account : accounts) {
            System.out.println(" - Account " + account.getAccountNumber() + ": " + account.getBalance());
        }
    }
}
