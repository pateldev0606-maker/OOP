package set;

import java.util.Scanner;

class BillGenerator {
    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount = Rs. " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount = Rs. " + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount = Rs. " + finalAmount);
    }
}

public class MallBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator b = new BillGenerator();

        int n, itemTotal, discount;
        double discountPercent;

        System.out.println("Choose Customer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer Customer");
        System.out.print("Enter your choice (n): ");
        n = sc.nextInt();

        System.out.print("Enter total item amount: ");
        itemTotal = sc.nextInt();

        if (n == 1) {
            System.out.println("\nRegular Customer Bill");
            b.generateBill(itemTotal);
        }
        else if (n == 2) {
            System.out.print("Enter flat discount in rupees: ");
            discount = sc.nextInt();

            System.out.println("\nPrivileged Customer Bill");
            b.generateBill(itemTotal, discount);
        }
        else if (n == 3) {
            System.out.print("Enter discount percentage: ");
            discountPercent = sc.nextDouble();

            System.out.println("\nFestive Offer Bill");
            b.generateBill(itemTotal, discountPercent);
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}
