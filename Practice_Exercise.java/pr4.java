package set;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weightPounds, heightInches;
        double weightKg, heightMeters, bmi;

        System.out.print("Enter weight in pounds: ");
        weightPounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        heightInches = sc.nextDouble();

        weightKg = weightPounds * 0.45359237;
        heightMeters = heightInches * 0.0254;

        bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI = " + bmi);

    }
}
