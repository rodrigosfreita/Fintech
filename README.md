Client and Bank Account Management System
This project is a simple system for managing clients and their bank accounts. The system allows the creation of clients, associating multiple accounts, performing transactions such as transfers and payments, and displaying detailed client and account information.

Features
1. Client Registration
The system allows registering a client with their name and CPF. A client can have multiple bank accounts.

2. Account Management
Each client can have one or more bank accounts, which can be either checking or savings accounts. For each account, the system stores the account number, initial balance, account type, and the owner's name.

3. Transactions
The system allows three types of transactions:

Transfers between accounts: transfers an amount from one account to another.
Payments: allows making payments from a specific account.
Debit and credit operations: performs withdrawals or deposits into accounts.
4. Information Display
The system can display detailed information about the client and associated accounts, including the balance and type of account.

Project Structure
The project consists of the following classes:

1. Client
This class represents the client in the system. It contains the following properties:

name: the client's name.
cpf: the client's CPF (tax identification number).
accounts: a list of accounts associated with the client.
Main methods:

addAccount: adds a new account to the client.
findAccountByNumber: searches for an account by its account number.
displayClientInfo: displays the client's information and their accounts.
2. Account
This class represents a bank account associated with a client. It contains the following properties:

accountNumber: the account number.
balance: the current balance of the account.
accountType: the type of account (Checking or Savings).
ownerName: the name of the account owner.
Main methods:

deposit: makes a deposit into the account.
withdraw: withdraws money from the account.
transfer: transfers an amount from one account to another.
displayBalance: displays the current account balance.
3. Payment
The Payment class is responsible for making payments from an account. It contains the following properties:

paymentId: the unique identifier for the payment.
amount: the payment amount.
paymentDate: the date when the payment was made.
account: the account from which the payment will be made.
description: an optional description of the payment.
Main methods:

makePayment: processes the payment, checking if there are sufficient funds.
displayPaymentDetails: displays the details of the payment.
4. Transaction
The Transaction class is used to record and execute financial transactions between accounts. It contains the following properties:

transactionId: the unique identifier for the transaction.
date: the transaction date.
amount: the amount involved in the transaction.
type: the type of transaction (Transfer, Debit, Credit).
sourceAccount: the account from which the transaction originates (in the case of transfers or debits).
destinationAccount: the account to which the transaction is sent (in the case of transfers or credits).
Main methods:

executeTransaction: performs the transaction based on the defined type.
displayTransactionDetails: displays the details of the transaction.
5. Main
The Main class is the user interface. It uses Scanner to receive inputs and interact with the system. The user can:

Register a client and their accounts.
Perform transfers between accounts.
Make payments.
Display the client's and their accounts' information.
How to Use
Compile and run the main code in the Main class.
Enter the client's name and CPF.
Add accounts to the client by entering the account number, initial balance, and account type.
Use the operations menu to perform transfers, make payments, or display client information.
Technologies Used
Java SE
Scanner for input
Control structures and list manipulation
