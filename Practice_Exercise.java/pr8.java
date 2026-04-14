package set;

import java.util.Scanner;

class Point {
    int x, y;

    Point() {
        x = 5;
        y = 5;
    }
    Point(int a, int b) {
        x = a;
        y = b;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

public class Mainpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);

        Point p3 = new Point(p2);

        System.out.println("\nUsing Default Constructor:");
        p1.display();

        System.out.println("Using Parameterized Constructor:");
        p2.display();

        System.out.println("Using Copy Constructor:");
        p3.display();
    }
}
