package set;

import java.util.Scanner;

class Rectangle {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Rectangle r = new Rectangle(w, h);

        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
    }
}
