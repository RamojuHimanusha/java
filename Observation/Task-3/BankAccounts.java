package javapractice;
class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    // Constructor
    public Account(int accountNumber, String accountHolderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited is " + amount);
    }

    // Withdrawal method
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn is " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Transfer method
    void transfer(Account other, double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            other.balance = other.balance + amount;

            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    // Display account details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}


// SavingsAccount inherits Account
class SavingsAccount extends Account {

    double interestRate;

   public SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;

        System.out.println("Interest Added: " + interest);
    }
}


// CurrentAccount inherits Account
class CurrentAccount extends Account {

    double overdraftLimit;

   public CurrentAccount(int accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {

        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    void withdraw(double amount) {

        if (balance + overdraftLimit >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}


// Main class
public class BankAccounts {

    public static void main(String[] args) {

        // Create SavingsAccount object
        SavingsAccount savings =
                new SavingsAccount(101, "riya", 10000, 5);

        // Create CurrentAccount object
        CurrentAccount current =
                new CurrentAccount(102, "Rahul", 5000, 3000);


        System.out.println("befor transactions");

        System.out.println("\nSavings Account:");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account:");
        current.displayAccountDetails();


        // Savings account deposit
        System.out.println("savings account transactions");

        savings.deposit(2000);

        savings.withdraw(1000);

        savings.calculateInterest();


        // Current account transactions
        System.out.println("current account transactions");

        current.deposit(2000);

        current.withdraw(9000);


        // Transfer money from savings to current
        System.out.println("amount transfer");

        savings.transfer(current, 3000);


        // Display final details
        System.out.println("after transaction");

        System.out.println("\nSavings Account:");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account:");
        current.displayAccountDetails();


        // Final balances
        System.out.println("final amount");

        System.out.println("Savings Account Balance: "
                + savings.balance);

        System.out.println("Current Account Balance: "
                + current.balance);
    }

}
/*output
befor transactions

Savings Account:
Account Number: 101
Account Holder: riya
Account Type: Savings
Balance: 10000.0

Current Account:
Account Number: 102
Account Holder: Rahul
Account Type: Current
Balance: 5000.0
savings account transactions
Deposited is 2000.0
Withdrawn is 1000.0
Interest Added: 550.0
current account transactions
Deposited is 2000.0
Withdrawn: 9000.0
amount transfer
Transferred: 3000.0
after transaction

Savings Account:
Account Number: 101
Account Holder: riya
Account Type: Savings
Balance: 8550.0

Current Account:
Account Number: 102
Account Holder: Rahul
Account Type: Current
Balance: 1000.0
final amount
Savings Account Balance: 8550.0
Current Account Balance: 1000.0
*/  
