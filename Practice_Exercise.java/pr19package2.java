package exam;

import student.Student;

public class Result extends Student {

    int marks1, marks2, marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        displayStudent(); // call base class method

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Result r = new Result(101, "Dev", 80, 75, 90);
        r.displayResult();
    }
}
