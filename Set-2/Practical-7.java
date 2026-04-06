package set;

import java.util.Scanner;

class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float simpleInterest = (principal * rate * time) / 100;
        float totalAmount = principal + simpleInterest;
        float emi = totalAmount / (time * 12);

        System.out.println("\nHome Loan EMI = Rs. " + emi + " per month");
    }

    void calculateEMI(double principal, int time, double rate) {
        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;
        double emi = totalAmount / (time * 12);

        System.out.println("\nVehicle Loan EMI = Rs. " + emi + " per month");
    }

    void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;
        double emi = totalAmount / (time * 12);

        System.out.println("\nPersonal Loan EMI = Rs. " + emi + " per month");
    }
}

public class LoanEMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanCalculator loan = new LoanCalculator();

        int choice;

        System.out.println("\n Loan EMI Calculator ");
        System.out.println("1. Home Loan");
        System.out.println("2. Vehicle Loan");
        System.out.println("3. Personal Loan");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            int principal, time;
            float rate;

            System.out.print("Enter Home Loan Principal Amount: ");
            principal = sc.nextInt();

            System.out.print("Enter Time (in years): ");
            time = sc.nextInt();

            System.out.print("Enter Interest Rate: ");
            rate = sc.nextFloat();

            loan.calculateEMI(principal, time, rate);
        }
        else if (choice == 2) {
            double principal, rate;
            int time;

            System.out.print("Enter Vehicle Loan Principal Amount: ");
            principal = sc.nextDouble();

            System.out.print("Enter Time (in years): ");
            time = sc.nextInt();

            System.out.print("Enter Interest Rate: ");
            rate = sc.nextDouble();

            loan.calculateEMI(principal, time, rate);
        }
        else if (choice == 3) {
            int principal, time;

            System.out.print("Enter Personal Loan Principal Amount: ");
            principal = sc.nextInt();

            System.out.print("Enter Time (in years): ");
            time = sc.nextInt();

            loan.calculateEMI(principal, time);
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}
