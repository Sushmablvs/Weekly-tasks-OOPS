public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor with name, accountNumber, and initial balance
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor with just name and accountNumber (initial balance is zero)
    public Account(String name, String accountNumber) {
        this(name, accountNumber, 0.0);
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and setter methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // toString method
    public String toString() {
        return "Account Information: \nName: " + name + "\nAccount Number: " + accountNumber + "\nBalance: $" + balance;
    }

    public static void main(String[] args) {
        // Open an account with just name and account number
        Account account1 = new Account("John Doe", "123456");

        // Display account information
        System.out.println("Account Information:");
        System.out.println(account1);

        // Deposit money into the account
        account1.deposit(1000);

        // Withdraw money from the account
        account1.withdraw(500);

        // Display updated account information
        System.out.println("Updated Account Information:");
        System.out.println(account1);
    }
}


