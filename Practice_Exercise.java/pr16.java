package set;

import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Not First Division";
        }
    }
}

public class pr16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Average Marks: ");
        double avg = sc.nextDouble();

        Result r = new Result();
        String result = r.getDivision(avg);

        System.out.println("Division: " + result);

    }
}
