package set;

import java.util.Scanner;

class Employee {
    protected String name;
    protected String department;

    void getDetails(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    private int teamSize;
    private String projectName;

    void getManagerDetails(String name, String department, int teamSize, String projectName) {
        super.getDetails(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Department: ");
        String dept = sc.next();

        e.getDetails(name, dept);

        Manager m = new Manager();
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Department: ");
        dept = sc.next();
        System.out.print("Team Size: ");
        int size = sc.nextInt();
        System.out.print("Project Name: ");
        String project = sc.next();

        m.getManagerDetails(name, dept, size, project);

        System.out.println("\n--- Employee Details ---");
        e.displayDetails();

        System.out.println("\n--- Manager Details ---");
        m.displayDetails();

        Employee ref = new Manager();
        ref.getDetails("Raj", "IT");

        System.out.println("\n--- Using Upcasting ---");
        ref.displayDetails(); // calls Manager's method

    }
}
