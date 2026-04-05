import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount;
        int n100 = 0, n50 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;

        System.out.print("Enter amount: ");
        amount = sc.nextInt();

        if (amount >= 100) {
            n100 = amount / 100;
            amount = amount % 100;
        }

        if (amount >= 50) {
            n50 = amount / 50;
            amount = amount % 50;
        }

        if (amount >= 10) {
            n10 = amount / 10;
            amount = amount % 10;
        }

        if (amount >= 5) {
            n5 = amount / 5;
            amount = amount % 5;
        }

        if (amount >= 2) {
            n2 = amount / 2;
            amount = amount % 2;
        }

        if (amount >= 1) {
            n1 = amount / 1;
            amount = amount % 1;
        }

        System.out.println("\nMinimum notes required:");
        System.out.println("100 = " + n100);
        System.out.println("50  = " + n50);
        System.out.println("10  = " + n10);
        System.out.println("5   = " + n5);
        System.out.println("2   = " + n2);
        System.out.println("1   = " + n1);

        sc.close();
    }
}
