class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public void getBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Encapsul {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.getBalance();

    }
}