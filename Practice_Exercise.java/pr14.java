package set;

import java.util.Scanner;

class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    void calculateInterest(double rate) {
        double interest = (balance * rate) / 100;
        System.out.println("Interest on Savings: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {

    void maturityAmount(double rate, int time) {
        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount: " + maturity);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Saving Account Details:");
        SavingAccount sa = new SavingAccount();
        System.out.print("Account No: ");
        String accNo = sc.next();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Initial Balance: ");
        double bal = sc.nextDouble();

        sa.openAccount(accNo, name, bal);

        sa.deposit(1000);
        sa.withdraw(500);
        sa.checkBalance();
        sa.calculateInterest(5);

        System.out.println("\nEnter Fixed Deposit Details:");
        FixedDepositAccount fd = new FixedDepositAccount();

        System.out.print("Account No: ");
        accNo = sc.next();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Deposit Amount: ");
        bal = sc.nextDouble();

        fd.openAccount(accNo, name, bal);

        fd.checkBalance();
        fd.maturityAmount(7, 2); 
    }
}
