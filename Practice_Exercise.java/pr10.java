package set;

import java.util.Scanner;

class BankAccount {

    String accountHolderName;
    double balance;

    static double interestRate; // static

    BankAccount(String name, double bal) {
        accountHolderName = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void display() {
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    static void setInterestRate(double rate) {
        interestRate = rate;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();
        BankAccount.setInterestRate(rate);

        System.out.print("Enter Name and Balance for Account 1: ");
        String name1 = sc.next();
        double bal1 = sc.nextDouble();

        System.out.print("Enter Name and Balance for Account 2: ");
        String name2 = sc.next();
        double bal2 = sc.nextDouble();

        BankAccount b1 = new BankAccount(name1, bal1);
        BankAccount b2 = new BankAccount(name2, bal2);

        b1.display();
        System.out.println();
        b2.display();
    }
}
