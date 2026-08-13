package javaprograms;
class Account {
     int accountNumber;
    double balance;
     String accountType;

    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void calculateInterest() {
        System.out.println("No interest");
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(int no, double balance, double rate) {
        super(no, balance, "Savings Account");
        interestRate = rate;
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest: " + interest);
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    CurrentAccount(int no, double balance, double limit) {
        super(no, balance, "Current Account");
        overdraftLimit = limit;
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Exceeds overdraft limit");
    }
}

public class BankAccounts {
    static void transfer(Account from, Account to, double amount) {
        if (amount > 0 && amount <= from.balance) {
            from.balance -= amount;
            to.balance += amount;
            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed");
        }
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 10000, 5);
        CurrentAccount current = new CurrentAccount(102, 5000, 3000);

        savings.display();
        savings.deposit(2000);
        savings.calculateInterest();

        current.display();
        current.withdraw(7000);

        transfer(savings, current, 3000);

        savings.display();
        current.display();
    }
}
/*Account Number: 101
Account Type: Savings Account
Balance: 10000.0
Interest: 600.0
Account Number: 102
Account Type: Current Account
Balance: 5000.0
Transfer successful
Account Number: 101
Account Type: Savings Account
Balance: 9600.0
Account Number: 102
Account Type: Current Account
Balance: 1000.0*/
