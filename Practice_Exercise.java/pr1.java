package set;

import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double meters, feet;

        System.out.print("Enter distance in meters: ");
        meters = sc.nextDouble();

        feet = meters * 3.28084;

        System.out.printf("Distance in feet = %.2f", feet);
    }
}
