package learning.constructors;

public class BankAccount {

    private long number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this(56789, 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(long number, double balance, String customerName,
                       String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(99999, 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public void setAccountNumber(long number) {
        if (number < 0) {
            System.out.println("Please provide a valid account number.");
            return;
        }
        this.number = number;
    }

    public long getAccountNumber() {
        return number;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Please provide a valid balance.");
            return;
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getEmail() {
        return customerEmail;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public String getName() {
        return customerName;
    }

    public void setPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void deposit(double funds) {
        if (funds > 0) {
            this.balance += funds;
            System.out.println("Deposit of " + funds + " is made. New balance is " + balance);
        }
    }

    public void withdrawal(double funds) {
        if (balance - funds >= 0) {
            this.balance -= funds;
            System.out.println("Withdrawal of " + funds + " is made. New balance is " + balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal cancelled.");
        }
    }
}
