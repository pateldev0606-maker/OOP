package set;

import java.util.Scanner;

class College {

    String collegeName;

    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void input() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void display() {
            System.out.println("\n-- Admission Details --");
            System.out.println("College Name: " + collegeName); 
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class Addme {
    public static void main(String[] args) {

        College c = new College("GTU College");

        College.Admission a = c.new Admission();

        a.input();
        a.display();
    }
}
