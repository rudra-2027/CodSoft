package CodSoft;

import java.util.Scanner;

class BankAccount { 
    double balance;

    public BankAccount(double initial_balance) {
        balance = initial_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Current balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Current balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
}



class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void Start() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void checkBalance() {
        System.out.println("\nCurrent Balance: " + account.getBalance());
    }

    private void deposit() {
        System.out.print("\nEnter the amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.print("\nEnter the amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        ATM atm = new ATM(account);
        atm.Start();
    }
}
