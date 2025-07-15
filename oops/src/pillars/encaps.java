package pillars;

class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance must be positive. Setting balance to 0.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sandhiya", 1000);

        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Final Balance: " + account.getBalance());
    }
}